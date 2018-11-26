/*
 * This file is generated by jOOQ.
*/
package com.agent.core.daos;


import com.agent.core.generated.tables.RepeatedPayment;
import com.agent.core.generated.tables.records.RepeatedPaymentRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 重复付款订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepeatedPaymentDao extends DAOImpl<RepeatedPaymentRecord, com.agent.core.pojos.RepeatedPayment, Integer> {

    /**
     * Create a new RepeatedPaymentDao without any configuration
     */
    public RepeatedPaymentDao() {
        super(RepeatedPayment.REPEATED_PAYMENT, com.agent.core.pojos.RepeatedPayment.class);
    }

    /**
     * Create a new RepeatedPaymentDao with an attached configuration
     */
    public RepeatedPaymentDao(Configuration configuration) {
        super(RepeatedPayment.REPEATED_PAYMENT, com.agent.core.pojos.RepeatedPayment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.agent.core.pojos.RepeatedPayment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchById(Integer... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.agent.core.pojos.RepeatedPayment fetchOneById(Integer value) {
        return fetchOne(RepeatedPayment.REPEATED_PAYMENT.ID, value);
    }

    /**
     * Fetch records that have <code>TRADE_NO IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByTradeNo(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.TRADE_NO, values);
    }

    /**
     * Fetch records that have <code>MERCHANT_NO IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByMerchantNo(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.MERCHANT_NO, values);
    }

    /**
     * Fetch records that have <code>PLATFORM IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByPlatform(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.PLATFORM, values);
    }

    /**
     * Fetch records that have <code>TRADE_AMOUNT IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByTradeAmount(BigInteger... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.TRADE_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>CREATE_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByCreateTime(LocalDateTime... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>SEQ_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchBySeqId(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.SEQ_ID, values);
    }

    /**
     * Fetch a unique record that has <code>SEQ_ID = value</code>
     */
    public com.agent.core.pojos.RepeatedPayment fetchOneBySeqId(String value) {
        return fetchOne(RepeatedPayment.REPEATED_PAYMENT.SEQ_ID, value);
    }

    /**
     * Fetch records that have <code>app_id IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByAppId(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.APP_ID, values);
    }

    /**
     * Fetch records that have <code>qrcode_num IN (values)</code>
     */
    public List<com.agent.core.pojos.RepeatedPayment> fetchByQrcodeNum(String... values) {
        return fetch(RepeatedPayment.REPEATED_PAYMENT.QRCODE_NUM, values);
    }
}
