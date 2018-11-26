package com.agent.core.util;

import java.util.Random;

/**
 * Created by 郝丹辉 on 2017/9/19.
 */
public class KeyUtils {

    public static String createRandom( int length) {
        String retStr = "";
        String strTable = "1234567890";
        int len = strTable.length();
        boolean bDone = true;
        do {
            retStr = "";
            int count = 0;
            for (int i = 0; i < length; i++) {
                double dblR = Math.random() * len;
                int intR = (int) Math.floor(dblR);
                char c = strTable.charAt(intR);
                if (('0' <= c) && (c <= '9')) {
                    count++;
                }
                retStr += strTable.charAt(intR);
            }
            if (count >= 2) {
                bDone = false;
            }
        } while (bDone);

        return retStr;
    }

    public static String financeRole = "[{\"resourceName\":\"overview\",\"status\":\"open\"},{\"resourceName\":\"security-center\",\"status\":\"open\"},{\"resourceName\":\"trade-password\",\"status\":\"open\"},{\"resourceName\":\"trade-manager\",\"status\":\"open\"},{\"resourceName\":\"pay-trade\",\"status\":\"open\"},{\"resourceName\":\"pay-trade-exports\",\"status\":\"open\"},{\"resourceName\":\"transfer-trade-exports\",\"status\":\"open\"},{\"resourceName\":\"transfer-trade\",\"status\":\"open\"},{\"resourceName\":\"account-detail\",\"status\":\"open\"},{\"resourceName\":\"account-detail-exports\",\"status\":\"open\"},{\"resourceName\":\"single-transfer\",\"status\":\"open\"},{\"resourceName\":\"agentpay-manager\",\"status\":\"open\"},{\"resourceName\":\"agentpay-query\",\"status\":\"open\"},{\"resourceName\":\"agentpay-query-exports\",\"status\":\"open\"},{\"resourceName\":\"single-pay\",\"status\":\"closed\"},{\"resourceName\":\"agentpay-customers\",\"status\":\"closed\"},{\"resourceName\":\"batch-agentpay\",\"status\":\"open\"},{\"resourceName\":\"batch-agentpay-apply\",\"status\":\"open\"},{\"resourceName\":\"agentpay-check\",\"status\":\"open\"},{\"resourceName\":\"merchant-service\",\"status\":\"closed\"},{\"resourceName\":\"reconciliation-download\",\"status\":\"closed\"},{\"resourceName\":\"system-manager\",\"status\":\"open\"},{\"resourceName\":\"role-manager\",\"status\":\"open\"},{\"resourceName\":\"role-info-create\",\"status\":\"closed\"},{\"resourceName\":\"operator-manager\",\"status\":\"open\"},{\"resourceName\":\"operator-info-create\",\"status\":\"closed\"}]";
    public static String commonRole =  "[{\"resourceName\":\"overview\",\"status\":\"open\"},{\"resourceName\":\"security-center\",\"status\":\"open\"},{\"resourceName\":\"trade-password\",\"status\":\"open\"},{\"resourceName\":\"trade-manager\",\"status\":\"open\"},{\"resourceName\":\"pay-trade\",\"status\":\"open\"},{\"resourceName\":\"pay-trade-exports\",\"status\":\"open\"},{\"resourceName\":\"transfer-trade-exports\",\"status\":\"open\"},{\"resourceName\":\"transfer-trade\",\"status\":\"open\"},{\"resourceName\":\"account-detail\",\"status\":\"open\"},{\"resourceName\":\"account-detail-exports\",\"status\":\"open\"},{\"resourceName\":\"single-transfer\",\"status\":\"open\"},{\"resourceName\":\"agentpay-manager\",\"status\":\"open\"},{\"resourceName\":\"agentpay-query\",\"status\":\"open\"},{\"resourceName\":\"agentpay-query-exports\",\"status\":\"open\"},{\"resourceName\":\"single-pay\",\"status\":\"closed\"},{\"resourceName\":\"agentpay-customers\",\"status\":\"closed\"},{\"resourceName\":\"batch-agentpay\",\"status\":\"closed\"},{\"resourceName\":\"batch-agentpay-apply\",\"status\":\"closed\"},{\"resourceName\":\"agentpay-check\",\"status\":\"closed\"},{\"resourceName\":\"merchant-service\",\"status\":\"closed\"},{\"resourceName\":\"reconciliation-download\",\"status\":\"closed\"},{\"resourceName\":\"system-manager\",\"status\":\"open\"},{\"resourceName\":\"role-manager\",\"status\":\"open\"},{\"resourceName\":\"role-info-create\",\"status\":\"closed\"},{\"resourceName\":\"operator-manager\",\"status\":\"open\"},{\"resourceName\":\"operator-info-create\",\"status\":\"closed\"}]";



    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();

        StringBuffer sb=new StringBuffer();

        for(int i=0;i<length;i++){

            int number =random.nextInt(36);

            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
