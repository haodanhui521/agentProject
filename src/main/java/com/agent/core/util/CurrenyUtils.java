package com.agent.core.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class CurrenyUtils {

    /**金额为分的格式 */
    public static final String CURRENCY_FEN_REGEX = "\\-?[0-9]+";

    /**
     * 功能描述：金额字符串转换：单位元转成单分
     *
     * @param s 传入需要转换的金额字符串
     * @return 转换后的金额字符串
     */
    public static String yuanToFen(String s) {
        if (StringUtils.isBlank(s)) {
            return "0";
        }
        int posIndex = -1;
        String str = "";
        StringBuilder sb = new StringBuilder();
        if (s != null && s.trim().length() > 0 && !s.equalsIgnoreCase("null")) {
            posIndex = s.indexOf(".");
            if (posIndex > 0) {
                int len = s.length();
                if (len == posIndex + 1) {
                    str = s.substring(0, posIndex);
                    if (str == "0") {
                        str = "";
                    }
                    sb.append(str).append("00");
                } else if (len == posIndex + 2) {
                    str = s.substring(0, posIndex);
                    if (str == "0") {
                        str = "";
                    }
                    sb.append(str).append(s.substring(posIndex + 1, posIndex + 2)).append("0");
                } else if (len == posIndex + 3) {
                    str = s.substring(0, posIndex);
                    if (str == "0") {
                        str = "";
                    }
                    sb.append(str).append(s.substring(posIndex + 1, posIndex + 3));
                } else {
                    str = s.substring(0, posIndex);
                    if (str == "0") {
                        str = "";
                    }
                    sb.append(str).append(s.substring(posIndex + 1, posIndex + 3));
                }
            } else {
                sb.append(s).append("00");
            }
        } else {
            sb.append("0");
        }
        str = removeZero(sb.toString());
        if (str != null && str.trim().length() > 0 && !str.trim().equalsIgnoreCase("null")) {
            return str;
        } else {
            return "0";
        }
    }

    /**
     *
     *  功能描述：去除字符串首部为"0"字符

     *  @param  str  传入需要转换的字符串
     *  @return  转换后的字符串
     */
    public  static  String  removeZero(String  str){
        char    ch;
        String  result  =  "";
        if(str  !=  null  &&  str.trim().length()>0  &&  !str.trim().equalsIgnoreCase("null")){
            try{
                for(int  i=0;i<str.length();i++){
                    ch  =  str.charAt(i);
                    if(ch  !=  '0'){
                        result  =  str.substring(i);
                        break;
                    }
                }
            }catch(Exception  e){
                result  =  "";
            }
        }else{
            result  =  "";
        }
        return  result;

    }

    public static String changeF2Y(BigDecimal amount) throws Exception{
        if(!amount.toString().matches(CURRENCY_FEN_REGEX)) {
            throw new Exception("金额格式有误");
        }

        int flag = 0;
        String amString = amount.toString();
        if(amString.charAt(0)=='-'){
            flag = 1;
            amString = amString.substring(1);
        }
        StringBuffer result = new StringBuffer();
        if(amString.length()==1){
            result.append("0.0").append(amString);
        }else if(amString.length() == 2){
            result.append("0.").append(amString);
        }else{
            String intString = amString.substring(0,amString.length()-2);
            for(int i=1; i<=intString.length();i++){
                if( (i-1)%3 == 0 && i !=1){
                    result.append(",");
                }
                result.append(intString.substring(intString.length()-i,intString.length()-i+1));
            }
            result.reverse().append(".").append(amString.substring(amString.length()-2));
        }
        if(flag == 1){
            return "-"+result.toString();
        }else{
            return result.toString();
        }
    }
}
