package com.agent.core.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class SignUtil {

    public static String joinMap(Map map, String fmt, boolean excloudBlankValue, String ...exclouds){
        String[] fmts=fmt.split("\\s+",2);
        String elem="";
        String sep="";
        if(fmts.length>0){
            elem=fmts[0].toLowerCase();
        }
        if(fmts.length>1){
            sep=fmts[1];
        }

        List exs= Arrays.asList(exclouds);
        List keyList=new ArrayList(map.keySet());
        Collections.sort(keyList);
        StringBuilder sb=new StringBuilder();
        Pattern p = Pattern.compile("k|v");
        for(Object key:keyList){
            String keyStr=toString(key);
            String valueStr=toString(map.get(key));

            if(StringUtils.isBlank(keyStr)||(excloudBlankValue&& StringUtils.isBlank(valueStr))||exs.contains(keyStr)){
                continue;
            }

            Matcher m = p.matcher(elem);
            StringBuffer thisElem = new StringBuffer();
            while (m.find()) {
                if(m.group().equals("k")) m.appendReplacement(thisElem, keyStr);
                else if(m.group().equals("v")) m.appendReplacement(thisElem, valueStr);
            }
            m.appendTail(thisElem);

            if(sb.length()>0){
                sb.append(sep);
            }

            sb.append(thisElem.toString());
        }
        return sb.toString();
    }

    public static String toString(Object obj){
        return obj==null ? null:obj.toString();
    }

    public static String SHA(String str,String key){
        return DigestUtils.sha1Hex((str + "&key=" + key));
    }

    public static String SHA(Map map,String key){
        String stringToSign = joinMap(map,"k=v &",true);
        log.debug(">>>> 签文：{}", stringToSign + "&key=" + key);
        String s = DigestUtils.sha1Hex((stringToSign + "&key=" + key));
        log.debug(">>>> 签值：{}", s);
        return s;
    }
}
