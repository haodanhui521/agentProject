/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 商户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Merchant implements Serializable {

    private static final long serialVersionUID = -671976716;

    private ULong         id;
    private String        merchantId;
    private String        merchantName;
    private String        loginNo;
    private Integer       isdeleted;
    private LocalDateTime createdTime;
    private LocalDateTime updateTime;
    private String        signKey;
    private String        mobile;
    private String        email;
    private String        appId;
    private String        note;

    public Merchant() {}

    public Merchant(Merchant value) {
        this.id = value.id;
        this.merchantId = value.merchantId;
        this.merchantName = value.merchantName;
        this.loginNo = value.loginNo;
        this.isdeleted = value.isdeleted;
        this.createdTime = value.createdTime;
        this.updateTime = value.updateTime;
        this.signKey = value.signKey;
        this.mobile = value.mobile;
        this.email = value.email;
        this.appId = value.appId;
        this.note = value.note;
    }

    public Merchant(
        ULong         id,
        String        merchantId,
        String        merchantName,
        String        loginNo,
        Integer       isdeleted,
        LocalDateTime createdTime,
        LocalDateTime updateTime,
        String        signKey,
        String        mobile,
        String        email,
        String        appId,
        String        note
    ) {
        this.id = id;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.loginNo = loginNo;
        this.isdeleted = isdeleted;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
        this.signKey = signKey;
        this.mobile = mobile;
        this.email = email;
        this.appId = appId;
        this.note = note;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getLoginNo() {
        return this.loginNo;
    }

    public void setLoginNo(String loginNo) {
        this.loginNo = loginNo;
    }

    public Integer getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getSignKey() {
        return this.signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Merchant (");

        sb.append(id);
        sb.append(", ").append(merchantId);
        sb.append(", ").append(merchantName);
        sb.append(", ").append(loginNo);
        sb.append(", ").append(isdeleted);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(signKey);
        sb.append(", ").append(mobile);
        sb.append(", ").append(email);
        sb.append(", ").append(appId);
        sb.append(", ").append(note);

        sb.append(")");
        return sb.toString();
    }
}