/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 设备表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Machine implements Serializable {

    private static final long serialVersionUID = -1240203754;

    private ULong         id;
    private String        merchantId;
    private String        machineId;
    private String        machineName;
    private Integer       enableStatus;
    private Integer       heartStatus;
    private String        machineInfo;
    private String        keyContent;
    private String        keyType;
    private String        accountType;
    private String        lineAccount;
    private Integer       isdeleted;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
    private String        appId;

    public Machine() {}

    public Machine(Machine value) {
        this.id = value.id;
        this.merchantId = value.merchantId;
        this.machineId = value.machineId;
        this.machineName = value.machineName;
        this.enableStatus = value.enableStatus;
        this.heartStatus = value.heartStatus;
        this.machineInfo = value.machineInfo;
        this.keyContent = value.keyContent;
        this.keyType = value.keyType;
        this.accountType = value.accountType;
        this.lineAccount = value.lineAccount;
        this.isdeleted = value.isdeleted;
        this.createdDate = value.createdDate;
        this.updateDate = value.updateDate;
        this.appId = value.appId;
    }

    public Machine(
        ULong         id,
        String        merchantId,
        String        machineId,
        String        machineName,
        Integer       enableStatus,
        Integer       heartStatus,
        String        machineInfo,
        String        keyContent,
        String        keyType,
        String        accountType,
        String        lineAccount,
        Integer       isdeleted,
        LocalDateTime createdDate,
        LocalDateTime updateDate,
        String        appId
    ) {
        this.id = id;
        this.merchantId = merchantId;
        this.machineId = machineId;
        this.machineName = machineName;
        this.enableStatus = enableStatus;
        this.heartStatus = heartStatus;
        this.machineInfo = machineInfo;
        this.keyContent = keyContent;
        this.keyType = keyType;
        this.accountType = accountType;
        this.lineAccount = lineAccount;
        this.isdeleted = isdeleted;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
        this.appId = appId;
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

    public String getMachineId() {
        return this.machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return this.machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public Integer getEnableStatus() {
        return this.enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getHeartStatus() {
        return this.heartStatus;
    }

    public void setHeartStatus(Integer heartStatus) {
        this.heartStatus = heartStatus;
    }

    public String getMachineInfo() {
        return this.machineInfo;
    }

    public void setMachineInfo(String machineInfo) {
        this.machineInfo = machineInfo;
    }

    public String getKeyContent() {
        return this.keyContent;
    }

    public void setKeyContent(String keyContent) {
        this.keyContent = keyContent;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getLineAccount() {
        return this.lineAccount;
    }

    public void setLineAccount(String lineAccount) {
        this.lineAccount = lineAccount;
    }

    public Integer getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Machine (");

        sb.append(id);
        sb.append(", ").append(merchantId);
        sb.append(", ").append(machineId);
        sb.append(", ").append(machineName);
        sb.append(", ").append(enableStatus);
        sb.append(", ").append(heartStatus);
        sb.append(", ").append(machineInfo);
        sb.append(", ").append(keyContent);
        sb.append(", ").append(keyType);
        sb.append(", ").append(accountType);
        sb.append(", ").append(lineAccount);
        sb.append(", ").append(isdeleted);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(appId);

        sb.append(")");
        return sb.toString();
    }
}
