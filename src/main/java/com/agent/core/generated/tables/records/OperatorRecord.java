/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables.records;


import com.agent.core.generated.tables.Operator;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OperatorRecord extends UpdatableRecordImpl<OperatorRecord> implements Record17<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1720581338;

    /**
     * Setter for <code>poppy_agent.operator.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>poppy_agent.operator.operator_no</code>. 用户号
     */
    public void setOperatorNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.operator_no</code>. 用户号
     */
    public String getOperatorNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>poppy_agent.operator.belong_to_org</code>. 直属组织号上下级关系
     */
    public void setBelongToOrg(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.belong_to_org</code>. 直属组织号上下级关系
     */
    public String getBelongToOrg() {
        return (String) get(2);
    }

    /**
     * Setter for <code>poppy_agent.operator.own_to_org</code>. 归属的组织, 一般用作夸组织的关系
     */
    public void setOwnToOrg(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.own_to_org</code>. 归属的组织, 一般用作夸组织的关系
     */
    public String getOwnToOrg() {
        return (String) get(3);
    }

    /**
     * Setter for <code>poppy_agent.operator.role_no</code>. 角色号
     */
    public void setRoleNo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.role_no</code>. 角色号
     */
    public String getRoleNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>poppy_agent.operator.user_name</code>. 用户名非空全局唯一
     */
    public void setUserName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.user_name</code>. 用户名非空全局唯一
     */
    public String getUserName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>poppy_agent.operator.mobile</code>. 可空 全局唯一
     */
    public void setMobile(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.mobile</code>. 可空 全局唯一
     */
    public String getMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>poppy_agent.operator.email</code>. 可空 全局唯一
     */
    public void setEmail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.email</code>. 可空 全局唯一
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>poppy_agent.operator.nick_name</code>. 可空 全局唯一
     */
    public void setNickName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.nick_name</code>. 可空 全局唯一
     */
    public String getNickName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>poppy_agent.operator.otp_key</code>. 动态口令码密钥
     */
    public void setOtpKey(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.otp_key</code>. 动态口令码密钥
     */
    public String getOtpKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>poppy_agent.operator.password</code>. 登录密码
     */
    public void setPassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.password</code>. 登录密码
     */
    public String getPassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>poppy_agent.operator.register_ip</code>. 注册时IP
     */
    public void setRegisterIp(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.register_ip</code>. 注册时IP
     */
    public String getRegisterIp() {
        return (String) get(11);
    }

    /**
     * Setter for <code>poppy_agent.operator.last_login_ip</code>. 上一次登录IP
     */
    public void setLastLoginIp(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.last_login_ip</code>. 上一次登录IP
     */
    public String getLastLoginIp() {
        return (String) get(12);
    }

    /**
     * Setter for <code>poppy_agent.operator.lock_status</code>. normal:正常 lock:锁定 锁定状态不能登录
     */
    public void setLockStatus(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.lock_status</code>. normal:正常 lock:锁定 锁定状态不能登录
     */
    public String getLockStatus() {
        return (String) get(13);
    }

    /**
     * Setter for <code>poppy_agent.operator.created_at</code>. 创建时间
     */
    public void setCreatedAt(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>poppy_agent.operator.updated_at</code>. 上次更新时间
     */
    public void setUpdatedAt(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.updated_at</code>. 上次更新时间
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>poppy_agent.operator.status</code>. normal:正常 disabled:关闭
     */
    public void setStatus(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>poppy_agent.operator.status</code>. normal:正常 disabled:关闭
     */
    public String getStatus() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Operator.OPERATOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Operator.OPERATOR.OPERATOR_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Operator.OPERATOR.BELONG_TO_ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Operator.OPERATOR.OWN_TO_ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Operator.OPERATOR.ROLE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Operator.OPERATOR.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Operator.OPERATOR.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Operator.OPERATOR.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Operator.OPERATOR.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Operator.OPERATOR.OTP_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Operator.OPERATOR.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Operator.OPERATOR.REGISTER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Operator.OPERATOR.LAST_LOGIN_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Operator.OPERATOR.LOCK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return Operator.OPERATOR.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return Operator.OPERATOR.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Operator.OPERATOR.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOperatorNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBelongToOrg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOwnToOrg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRoleNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOtpKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRegisterIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLastLoginIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLockStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value2(String value) {
        setOperatorNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value3(String value) {
        setBelongToOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value4(String value) {
        setOwnToOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value5(String value) {
        setRoleNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value6(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value7(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value9(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value10(String value) {
        setOtpKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value11(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value12(String value) {
        setRegisterIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value13(String value) {
        setLastLoginIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value14(String value) {
        setLockStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value15(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value16(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord value17(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Timestamp value15, Timestamp value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OperatorRecord
     */
    public OperatorRecord() {
        super(Operator.OPERATOR);
    }

    /**
     * Create a detached, initialised OperatorRecord
     */
    public OperatorRecord(Long id, String operatorNo, String belongToOrg, String ownToOrg, String roleNo, String userName, String mobile, String email, String nickName, String otpKey, String password, String registerIp, String lastLoginIp, String lockStatus, Timestamp createdAt, Timestamp updatedAt, String status) {
        super(Operator.OPERATOR);

        set(0, id);
        set(1, operatorNo);
        set(2, belongToOrg);
        set(3, ownToOrg);
        set(4, roleNo);
        set(5, userName);
        set(6, mobile);
        set(7, email);
        set(8, nickName);
        set(9, otpKey);
        set(10, password);
        set(11, registerIp);
        set(12, lastLoginIp);
        set(13, lockStatus);
        set(14, createdAt);
        set(15, updatedAt);
        set(16, status);
    }
}
