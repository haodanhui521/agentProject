package com.agent.core.util;


import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class TradeNoUtil {

    public static final String PREFIX_TRADE_NO = "CC";

    public static String buildTradeNo(Date date, String merchantId, long number){
        String merchantPart = merchantId.substring(2,4);
        String timePart = DateUtils.formatDate(date, "yyMMddHHmmss");
        String seq;
        if (number > 9999) {
            seq = StringUtils.right(String.valueOf(number), 4);
        } else {
            seq = StringUtils.leftPad(String.valueOf(number),4,'0');
        }
        return PREFIX_TRADE_NO + merchantPart + timePart + seq;
    }

}

