/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import javax.annotation.Generated;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;


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
public class TradeInfo implements Serializable {

    private static final long serialVersionUID = 615478257;

    private Integer       id;
    private String        tradeNo;
    private String        merchantNo;
    private String        platform;
    private BigInteger    tradeAmount;
    private String        ip;
    private LocalDateTime submitTime;
    private LocalDateTime createTime;
    private LocalDateTime doneTime;
    private LocalDateTime updateTime;
    private String        tradeStatus;
    private String        tradeErrcode;
    private String        tradeErrmsg;
    private String        seqId;
    private String        qrCode;
    private String        notifyStatus;
    private String        deviceId;
    private String        merchantTradeNo;
    private String        notifyUrl;
    private String        payeeAccountNo;
    private String        method;
    private String        appId;
    private String        qrcodeNum;

    public TradeInfo() {}

    public TradeInfo(TradeInfo value) {
        this.id = value.id;
        this.tradeNo = value.tradeNo;
        this.merchantNo = value.merchantNo;
        this.platform = value.platform;
        this.tradeAmount = value.tradeAmount;
        this.ip = value.ip;
        this.submitTime = value.submitTime;
        this.createTime = value.createTime;
        this.doneTime = value.doneTime;
        this.updateTime = value.updateTime;
        this.tradeStatus = value.tradeStatus;
        this.tradeErrcode = value.tradeErrcode;
        this.tradeErrmsg = value.tradeErrmsg;
        this.seqId = value.seqId;
        this.qrCode = value.qrCode;
        this.notifyStatus = value.notifyStatus;
        this.deviceId = value.deviceId;
        this.merchantTradeNo = value.merchantTradeNo;
        this.notifyUrl = value.notifyUrl;
        this.payeeAccountNo = value.payeeAccountNo;
        this.method = value.method;
        this.appId = value.appId;
        this.qrcodeNum = value.qrcodeNum;
    }

    public TradeInfo(
        Integer       id,
        String        tradeNo,
        String        merchantNo,
        String        platform,
        BigInteger    tradeAmount,
        String        ip,
        LocalDateTime submitTime,
        LocalDateTime createTime,
        LocalDateTime doneTime,
        LocalDateTime updateTime,
        String        tradeStatus,
        String        tradeErrcode,
        String        tradeErrmsg,
        String        seqId,
        String        qrCode,
        String        notifyStatus,
        String        deviceId,
        String        merchantTradeNo,
        String        notifyUrl,
        String        payeeAccountNo,
        String        method,
        String        appId,
        String        qrcodeNum
    ) {
        this.id = id;
        this.tradeNo = tradeNo;
        this.merchantNo = merchantNo;
        this.platform = platform;
        this.tradeAmount = tradeAmount;
        this.ip = ip;
        this.submitTime = submitTime;
        this.createTime = createTime;
        this.doneTime = doneTime;
        this.updateTime = updateTime;
        this.tradeStatus = tradeStatus;
        this.tradeErrcode = tradeErrcode;
        this.tradeErrmsg = tradeErrmsg;
        this.seqId = seqId;
        this.qrCode = qrCode;
        this.notifyStatus = notifyStatus;
        this.deviceId = deviceId;
        this.merchantTradeNo = merchantTradeNo;
        this.notifyUrl = notifyUrl;
        this.payeeAccountNo = payeeAccountNo;
        this.method = method;
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

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDateTime getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getDoneTime() {
        return this.doneTime;
    }

    public void setDoneTime(LocalDateTime doneTime) {
        this.doneTime = doneTime;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getTradeErrcode() {
        return this.tradeErrcode;
    }

    public void setTradeErrcode(String tradeErrcode) {
        this.tradeErrcode = tradeErrcode;
    }

    public String getTradeErrmsg() {
        return this.tradeErrmsg;
    }

    public void setTradeErrmsg(String tradeErrmsg) {
        this.tradeErrmsg = tradeErrmsg;
    }

    public String getSeqId() {
        return this.seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getNotifyStatus() {
        return this.notifyStatus;
    }

    public void setNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMerchantTradeNo() {
        return this.merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPayeeAccountNo() {
        return this.payeeAccountNo;
    }

    public void setPayeeAccountNo(String payeeAccountNo) {
        this.payeeAccountNo = payeeAccountNo;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
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
        StringBuilder sb = new StringBuilder("TradeInfo (");

        sb.append(id);
        sb.append(", ").append(tradeNo);
        sb.append(", ").append(merchantNo);
        sb.append(", ").append(platform);
        sb.append(", ").append(tradeAmount);
        sb.append(", ").append(ip);
        sb.append(", ").append(submitTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(doneTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(tradeStatus);
        sb.append(", ").append(tradeErrcode);
        sb.append(", ").append(tradeErrmsg);
        sb.append(", ").append(seqId);
        sb.append(", ").append(qrCode);
        sb.append(", ").append(notifyStatus);
        sb.append(", ").append(deviceId);
        sb.append(", ").append(merchantTradeNo);
        sb.append(", ").append(notifyUrl);
        sb.append(", ").append(payeeAccountNo);
        sb.append(", ").append(method);
        sb.append(", ").append(appId);
        sb.append(", ").append(qrcodeNum);

        sb.append(")");
        return sb.toString();
    }
}