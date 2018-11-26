package com.agent.core.util;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hacker li
 */
public class ComputerUtils {

    private static final String E0 = "0000000000E0";
    private static String macAddressStr = null;
    private static String computerName = System.getenv().get("COMPUTERNAME");
    private static final String[] windowsCommand = { "ipconfig", "/all" };
    private static final String[] linuxCommand = { "/sbin/ifconfig", "eth0" };
    private static String[] specialLinuxCommand = null;
    private static final Pattern macPattern = Pattern.compile(".*((:?[0-9a-f]{2}[-:]){5}[0-9a-f]{2}).*",
            Pattern.CASE_INSENSITIVE);

    /**
     * 获取多个网卡地址
     *
     * @return
     * @throws IOException
     */
    private final static List<String> getMacAddressList() throws IOException {
        final ArrayList<String> macAddressList = new ArrayList<String>();
        final String os = System.getProperty("os.name");
        final String command[];

        if (os.startsWith("Windows")) {
            command = windowsCommand;
        } else if (os.startsWith("Linux")) {
            command = linuxCommand;
        } else {
            throw new IOException("Unknow operating system:" + os);
        }
        // 执行命令
        final Process process = Runtime.getRuntime().exec(command);

        BufferedReader bufReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        for (String line = null; (line = bufReader.readLine()) != null;) {
            Matcher matcher = macPattern.matcher(line);
            if (matcher.matches()) {
                macAddressList.add(matcher.group(1));
                // macAddressList.add(matcher.group(1).replaceAll("[-:]",
                // ""));//去掉MAC中的“-”
            }
        }

        process.destroy();
        bufReader.close();
        return macAddressList;
    }

    /**
     * 获取一个网卡地址（多个网卡时从中获取一个）
     *
     * @return
     */
    public static String getMacAddress() {
        if (macAddressStr == null || StringUtils.isBlank(macAddressStr)) {
            StringBuffer sb = new StringBuffer(); // 存放多个网卡地址用，目前只取一个非0000000000E0隧道的值
            try {
                List<String> macList = getMacAddressListNew();
                Collections.sort(macList);
                if(macList != null){
                    macAddressStr = macList.get(0);
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return macAddressStr;
    }

//    public static void main(String[] args) throws Exception{
//
//        System.out.println(ComputerUtils.getMacAddress());
//    }
    public static List<String> getMacAddressListNew() throws SocketException
    {
        List<String> listAdr = new ArrayList<>();
        Enumeration<NetworkInterface> nifs = NetworkInterface.getNetworkInterfaces();
        if (nifs == null) {
            return listAdr;
        }

        while (nifs.hasMoreElements())
        {
            NetworkInterface nif = nifs.nextElement();

            Enumeration<InetAddress> adrs = nif.getInetAddresses();
            while ( adrs.hasMoreElements() )
            {
                InetAddress adr = adrs.nextElement();

                if ( localIpFilter(nif, adr) )
                {
                    listAdr.add(getLocalMac(adr));
                }
            }
        }
        return listAdr;
    }
    private static String getLocalMac(InetAddress ia) throws SocketException {

        //获取网卡，获取地址
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<mac.length; i++) {
            if(i!=0) {
                sb.append(":");
            }
            //字节转换为整数
            int temp = mac[i]&0xff;
            String str = Integer.toHexString(temp);
            if(str.length()==1) {
                sb.append("0"+str);
            }else {
                sb.append(str);
            }
        }
        return sb.toString().toUpperCase();
    }

    public static boolean localIpFilter(NetworkInterface nif, InetAddress adr) throws SocketException
    {
        return (adr != null) && !adr.isLoopbackAddress() && (nif.isPointToPoint() || !adr.isLinkLocalAddress()) && !nif.getName().contains("net") && !nif.getDisplayName().contains("Virtual");

    }
    /**
     * 获取电脑名
     *
     * @return
     */
    public static String getComputerName() {
        if (computerName == null || StringUtils.isBlank(computerName)) {
            computerName = System.getenv().get("COMPUTERNAME");
        }
        return computerName;
    }

    /**
     * 获取客户端IP地址
     *
     * @return
     */
    public static String getIpAddrAndName() throws IOException {
        return InetAddress.getLocalHost().toString();
    }

    /**
     * 获取客户端IP地址
     *
     * @return
     */
    public static String getIpAddr() throws IOException {
        return InetAddress.getLocalHost().getHostAddress().toString();
    }

    /**
     * 获取电脑唯一标识
     *
     * @return
     */
    public static String getComputerID() {
        String id = getMacAddress();
        if (id == null || StringUtils.isBlank(id)) {
            try {
                id = getIpAddrAndName();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return computerName;
    }

    public static String getServerIp() {
        // 获取操作系统类型
        String sysType = System.getProperties().getProperty("os.name");
        String ip;
        if (sysType.toLowerCase().startsWith("win")) {  // 如果是Windows系统，获取本地IP地址
            String localIP = null;
            try {
                localIP = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            if (localIP != null) {
                return localIP;
            }
        } else {
            ip = getIpByEthNum("eth0"); // 兼容Linux
            if (ip != null) {
                return ip;
            }
        }
        return "获取服务器IP错误";
    }


    private static String getIpByEthNum(String ethNum) {
        try {
            Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                if (ethNum.equals(netInterface.getName())) {
                    Enumeration addresses = netInterface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        ip = (InetAddress) addresses.nextElement();
                        if (ip != null && ip instanceof Inet4Address) {
                            return ip.getHostAddress();
                        }
                    }
                }
            }
        } catch (SocketException e) {
            return null;
        }
        return "获取服务器IP错误";
    }
}
