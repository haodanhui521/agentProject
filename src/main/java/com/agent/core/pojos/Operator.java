/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 操作员
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Operator implements Serializable {

    private static final long serialVersionUID = -2038769140;

    private Long      id;
    private String    operatorNo;
    private String    belongToOrg;
    private String    ownToOrg;
    private String    roleNo;
    private String    userName;
    private String    mobile;
    private String    email;
    private String    nickName;
    private String    otpKey;
    private String    password;
    private String    registerIp;
    private String    lastLoginIp;
    private String    lockStatus;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String    status;

    public Operator() {}

    public Operator(Operator value) {
        this.id = value.id;
        this.operatorNo = value.operatorNo;
        this.belongToOrg = value.belongToOrg;
        this.ownToOrg = value.ownToOrg;
        this.roleNo = value.roleNo;
        this.userName = value.userName;
        this.mobile = value.mobile;
        this.email = value.email;
        this.nickName = value.nickName;
        this.otpKey = value.otpKey;
        this.password = value.password;
        this.registerIp = value.registerIp;
        this.lastLoginIp = value.lastLoginIp;
        this.lockStatus = value.lockStatus;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.status = value.status;
    }

    public Operator(
        Long      id,
        String    operatorNo,
        String    belongToOrg,
        String    ownToOrg,
        String    roleNo,
        String    userName,
        String    mobile,
        String    email,
        String    nickName,
        String    otpKey,
        String    password,
        String    registerIp,
        String    lastLoginIp,
        String    lockStatus,
        Timestamp createdAt,
        Timestamp updatedAt,
        String    status
    ) {
        this.id = id;
        this.operatorNo = operatorNo;
        this.belongToOrg = belongToOrg;
        this.ownToOrg = ownToOrg;
        this.roleNo = roleNo;
        this.userName = userName;
        this.mobile = mobile;
        this.email = email;
        this.nickName = nickName;
        this.otpKey = otpKey;
        this.password = password;
        this.registerIp = registerIp;
        this.lastLoginIp = lastLoginIp;
        this.lockStatus = lockStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperatorNo() {
        return this.operatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getBelongToOrg() {
        return this.belongToOrg;
    }

    public void setBelongToOrg(String belongToOrg) {
        this.belongToOrg = belongToOrg;
    }

    public String getOwnToOrg() {
        return this.ownToOrg;
    }

    public void setOwnToOrg(String ownToOrg) {
        this.ownToOrg = ownToOrg;
    }

    public String getRoleNo() {
        return this.roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getOtpKey() {
        return this.otpKey;
    }

    public void setOtpKey(String otpKey) {
        this.otpKey = otpKey;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterIp() {
        return this.registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLockStatus() {
        return this.lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Operator (");

        sb.append(id);
        sb.append(", ").append(operatorNo);
        sb.append(", ").append(belongToOrg);
        sb.append(", ").append(ownToOrg);
        sb.append(", ").append(roleNo);
        sb.append(", ").append(userName);
        sb.append(", ").append(mobile);
        sb.append(", ").append(email);
        sb.append(", ").append(nickName);
        sb.append(", ").append(otpKey);
        sb.append(", ").append(password);
        sb.append(", ").append(registerIp);
        sb.append(", ").append(lastLoginIp);
        sb.append(", ").append(lockStatus);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
