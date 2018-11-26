/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


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
public class RepeatedPayment implements Serializable {

    private static final long serialVersionUID = -532496979;

    private Integer       id;
    private String        tradeNo;
    private String        merchantNo;
    private String        platform;
    private BigInteger    tradeAmount;
    private LocalDateTime createTime;
    private String        seqId;
    private String        appId;
    private String        qrcodeNum;

    public RepeatedPayment() {}

    public RepeatedPayment(RepeatedPayment value) {
        this.id = value.id;
        this.tradeNo = value.tradeNo;
        this.merchantNo = value.merchantNo;
        this.platform = value.platform;
        this.tradeAmount = value.tradeAmount;
        this.createTime = value.createTime;
        this.seqId = value.seqId;
        this.appId = value.appId;
        this.qrcodeNum = value.qrcodeNum;
    }

    public RepeatedPayment(
        Integer       id,
        String        tradeNo,
        String        merchantNo,
        String        platform,
        BigInteger    tradeAmount,
        LocalDateTime createTime,
        String        seqId,
        String        appId,
        String        qrcodeNum
    ) {
        this.id = id;
        this.tradeNo = tradeNo;
        this.merchantNo = merchantNo;
        this.platform = platform;
        this.tradeAmount = tradeAmount;
        this.createTime = createTime;
        this.seqId = seqId;
        this.appId = appId;
        this.qrcodeNum = qrcodeNum;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getMerchantNo() {
        return this.merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public BigInteger getTradeAmount() {
        return this.tradeAmount;
    }

    public void setTradeAmount(BigInteger tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getSeqId() {
        return this.seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getQrcodeNum() {
        return this.qrcodeNum;
    }

    public void setQrcodeNum(String qrcodeNum) {
        this.qrcodeNum = qrcodeNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RepeatedPayment (");

        sb.append(id);
        sb.append(", ").append(tradeNo);
        sb.append(", ").append(merchantNo);
        sb.append(", ").append(platform);
        sb.append(", ").append(tradeAmount);
        sb.append(", ").append(createTime);
        sb.append(", ").append(seqId);
        sb.append(", ").append(appId);
        sb.append(", ").append(qrcodeNum);

        sb.append(")");
        return sb.toString();
    }
}