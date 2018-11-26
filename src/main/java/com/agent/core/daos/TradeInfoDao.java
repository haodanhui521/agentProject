/*
 * This file is generated by jOOQ.
*/
package com.agent.core.daos;


import com.agent.core.generated.tables.TradeInfo;
import com.agent.core.generated.tables.records.TradeInfoRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 交易订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TradeInfoDao extends DAOImpl<TradeInfoRecord, com.agent.core.pojos.TradeInfo, Integer> {

    /**
     * Create a new TradeInfoDao without any configuration
     */
    public TradeInfoDao() {
        super(TradeInfo.TRADE_INFO, com.agent.core.pojos.TradeInfo.class);
    }

    /**
     * Create a new TradeInfoDao with an attached configuration
     */
    public TradeInfoDao(Configuration configuration) {
        super(TradeInfo.TRADE_INFO, com.agent.core.pojos.TradeInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.agent.core.pojos.TradeInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchById(Integer... values) {
        return fetch(TradeInfo.TRADE_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.agent.core.pojos.TradeInfo fetchOneById(Integer value) {
        return fetchOne(TradeInfo.TRADE_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>TRADE_NO IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByTradeNo(String... values) {
        return fetch(TradeInfo.TRADE_INFO.TRADE_NO, values);
    }

    /**
     * Fetch a unique record that has <code>TRADE_NO = value</code>
     */
    public com.agent.core.pojos.TradeInfo fetchOneByTradeNo(String value) {
        return fetchOne(TradeInfo.TRADE_INFO.TRADE_NO, value);
    }

    /**
     * Fetch records that have <code>MERCHANT_NO IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByMerchantNo(String... values) {
        return fetch(TradeInfo.TRADE_INFO.MERCHANT_NO, values);
    }

    /**
     * Fetch records that have <code>PLATFORM IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByPlatform(String... values) {
        return fetch(TradeInfo.TRADE_INFO.PLATFORM, values);
    }

    /**
     * Fetch records that have <code>TRADE_AMOUNT IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByTradeAmount(BigInteger... values) {
        return fetch(TradeInfo.TRADE_INFO.TRADE_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>IP IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByIp(String... values) {
        return fetch(TradeInfo.TRADE_INFO.IP, values);
    }

    /**
     * Fetch records that have <code>SUBMIT_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchBySubmitTime(LocalDateTime... values) {
        return fetch(TradeInfo.TRADE_INFO.SUBMIT_TIME, values);
    }

    /**
     * Fetch records that have <code>CREATE_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByCreateTime(LocalDateTime... values) {
        return fetch(TradeInfo.TRADE_INFO.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>DONE_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByDoneTime(LocalDateTime... values) {
        return fetch(TradeInfo.TRADE_INFO.DONE_TIME, values);
    }

    /**
     * Fetch records that have <code>UPDATE_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TradeInfo.TRADE_INFO.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>TRADE_STATUS IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByTradeStatus(String... values) {
        return fetch(TradeInfo.TRADE_INFO.TRADE_STATUS, values);
    }

    /**
     * Fetch records that have <code>TRADE_ERRCODE IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByTradeErrcode(String... values) {
        return fetch(TradeInfo.TRADE_INFO.TRADE_ERRCODE, values);
    }

    /**
     * Fetch records that have <code>TRADE_ERRMSG IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByTradeErrmsg(String... values) {
        return fetch(TradeInfo.TRADE_INFO.TRADE_ERRMSG, values);
    }

    /**
     * Fetch records that have <code>SEQ_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchBySeqId(String... values) {
        return fetch(TradeInfo.TRADE_INFO.SEQ_ID, values);
    }

    /**
     * Fetch records that have <code>QR_CODE IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByQrCode(String... values) {
        return fetch(TradeInfo.TRADE_INFO.QR_CODE, values);
    }

    /**
     * Fetch records that have <code>NOTIFY_STATUS IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByNotifyStatus(String... values) {
        return fetch(TradeInfo.TRADE_INFO.NOTIFY_STATUS, values);
    }

    /**
     * Fetch records that have <code>DEVICE_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByDeviceId(String... values) {
        return fetch(TradeInfo.TRADE_INFO.DEVICE_ID, values);
    }

    /**
     * Fetch records that have <code>merchant_trade_no IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByMerchantTradeNo(String... values) {
        return fetch(TradeInfo.TRADE_INFO.MERCHANT_TRADE_NO, values);
    }

    /**
     * Fetch records that have <code>notify_url IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByNotifyUrl(String... values) {
        return fetch(TradeInfo.TRADE_INFO.NOTIFY_URL, values);
    }

    /**
     * Fetch records that have <code>PAYEE_ACCOUNT_NO IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByPayeeAccountNo(String... values) {
        return fetch(TradeInfo.TRADE_INFO.PAYEE_ACCOUNT_NO, values);
    }

    /**
     * Fetch records that have <code>method IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByMethod(String... values) {
        return fetch(TradeInfo.TRADE_INFO.METHOD, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByAppId(String... values) {
        return fetch(TradeInfo.TRADE_INFO.APP_ID, values);
    }

    /**
     * Fetch records that have <code>QRCODE_NUM IN (values)</code>
     */
    public List<com.agent.core.pojos.TradeInfo> fetchByQrcodeNum(String... values) {
        return fetch(TradeInfo.TRADE_INFO.QRCODE_NUM, values);
    }

    @Override
    public void insert(com.agent.core.pojos.TradeInfo tradeInfo) {
        super.insert(tradeInfo);
    }
}
