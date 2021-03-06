/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables.records;


import com.agent.core.generated.tables.Org;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 组织
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrgRecord extends UpdatableRecordImpl<OrgRecord> implements Record19<Long, String, String, String, String, String, String, String, String, String, String, String, Short, Short, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1439509862;

    /**
     * Setter for <code>poppy_agent.org.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>poppy_agent.org.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>poppy_agent.org.org_no</code>. 组织号 全局唯一， 全局第一个组织是根,规则 固定 00 0000000000000 15位
     */
    public void setOrgNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>poppy_agent.org.org_no</code>. 组织号 全局唯一， 全局第一个组织是根,规则 固定 00 0000000000000 15位
     */
    public String getOrgNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>poppy_agent.org.belong_to_org</code>. 直属组织号上下级关系，eg.因为推荐形成的组织关系
     */
    public void setBelongToOrg(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>poppy_agent.org.belong_to_org</code>. 直属组织号上下级关系，eg.因为推荐形成的组织关系
     */
    public String getBelongToOrg() {
        return (String) get(2);
    }

    /**
     * Setter for <code>poppy_agent.org.own_to_org</code>. 归属的组织, 一般用作夸组织的关系
     */
    public void setOwnToOrg(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>poppy_agent.org.own_to_org</code>. 归属的组织, 一般用作夸组织的关系
     */
    public String getOwnToOrg() {
        return (String) get(3);
    }

    /**
     * Setter for <code>poppy_agent.org.out_org_no</code>. 外部组织号，一般用于对接第三放，存放他们的唯一组织（商户,代理）号
     */
    public void setOutOrgNo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>poppy_agent.org.out_org_no</code>. 外部组织号，一般用于对接第三放，存放他们的唯一组织（商户,代理）号
     */
    public String getOutOrgNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>poppy_agent.org.name</code>. 组织名称
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>poppy_agent.org.name</code>. 组织名称
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>poppy_agent.org.nick_name</code>. 组织名称昵称
     */
    public void setNickName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>poppy_agent.org.nick_name</code>. 组织名称昵称
     */
    public String getNickName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>poppy_agent.org.desc</code>. 组织描述
     */
    public void setDesc(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>poppy_agent.org.desc</code>. 组织描述
     */
    public String getDesc() {
        return (String) get(7);
    }

    /**
     * Setter for <code>poppy_agent.org.mobile</code>. 手机
     */
    public void setMobile(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>poppy_agent.org.mobile</code>. 手机
     */
    public String getMobile() {
        return (String) get(8);
    }

    /**
     * Setter for <code>poppy_agent.org.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>poppy_agent.org.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>poppy_agent.org.website</code>. 网站
     */
    public void setWebsite(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>poppy_agent.org.website</code>. 网站
     */
    public String getWebsite() {
        return (String) get(10);
    }

    /**
     * Setter for <code>poppy_agent.org.type</code>. 类型 可能值 root, platform, merchant, agent
     */
    public void setType(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>poppy_agent.org.type</code>. 类型 可能值 root, platform, merchant, agent
     */
    public String getType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>poppy_agent.org.level</code>. 层级 默认1级开始
     */
    public void setLevel(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>poppy_agent.org.level</code>. 层级 默认1级开始
     */
    public Short getLevel() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>poppy_agent.org.max_level</code>. 改组织下面允许的最大层级
     */
    public void setMaxLevel(Short value) {
        set(13, value);
    }

    /**
     * Getter for <code>poppy_agent.org.max_level</code>. 改组织下面允许的最大层级
     */
    public Short getMaxLevel() {
        return (Short) get(13);
    }

    /**
     * Setter for <code>poppy_agent.org.creator_create_type</code>. 创建人的创建方式预留
     */
    public void setCreatorCreateType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>poppy_agent.org.creator_create_type</code>. 创建人的创建方式预留
     */
    public String getCreatorCreateType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>poppy_agent.org.creator_name</code>. 创建人名字
     */
    public void setCreatorName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>poppy_agent.org.creator_name</code>. 创建人名字
     */
    public String getCreatorName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>poppy_agent.org.created_at</code>. 创建时间
     */
    public void setCreatedAt(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>poppy_agent.org.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>poppy_agent.org.updated_at</code>. 上次更新时间
     */
    public void setUpdatedAt(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>poppy_agent.org.updated_at</code>. 上次更新时间
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>poppy_agent.org.status</code>. normal:正常 disabled:关闭
     */
    public void setStatus(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>poppy_agent.org.status</code>. normal:正常 disabled:关闭
     */
    public String getStatus() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, String, String, String, String, String, String, String, String, String, String, Short, Short, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, String, String, String, String, String, String, String, String, String, String, Short, Short, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Org.ORG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Org.ORG.ORG_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Org.ORG.BELONG_TO_ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Org.ORG.OWN_TO_ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Org.ORG.OUT_ORG_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Org.ORG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Org.ORG.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Org.ORG.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Org.ORG.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Org.ORG.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Org.ORG.WEBSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Org.ORG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return Org.ORG.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field14() {
        return Org.ORG.MAX_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Org.ORG.CREATOR_CREATE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Org.ORG.CREATOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Org.ORG.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return Org.ORG.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Org.ORG.STATUS;
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
        return getOrgNo();
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
        return getOutOrgNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value14() {
        return getMaxLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCreatorCreateType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCreatorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value2(String value) {
        setOrgNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value3(String value) {
        setBelongToOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value4(String value) {
        setOwnToOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value5(String value) {
        setOutOrgNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value7(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value8(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value9(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value10(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value11(String value) {
        setWebsite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value12(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value13(Short value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value14(Short value) {
        setMaxLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value15(String value) {
        setCreatorCreateType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value16(String value) {
        setCreatorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value17(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value18(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord value19(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrgRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Short value13, Short value14, String value15, String value16, Timestamp value17, Timestamp value18, String value19) {
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
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrgRecord
     */
    public OrgRecord() {
        super(Org.ORG);
    }

    /**
     * Create a detached, initialised OrgRecord
     */
    public OrgRecord(Long id, String orgNo, String belongToOrg, String ownToOrg, String outOrgNo, String name, String nickName, String desc, String mobile, String email, String website, String type, Short level, Short maxLevel, String creatorCreateType, String creatorName, Timestamp createdAt, Timestamp updatedAt, String status) {
        super(Org.ORG);

        set(0, id);
        set(1, orgNo);
        set(2, belongToOrg);
        set(3, ownToOrg);
        set(4, outOrgNo);
        set(5, name);
        set(6, nickName);
        set(7, desc);
        set(8, mobile);
        set(9, email);
        set(10, website);
        set(11, type);
        set(12, level);
        set(13, maxLevel);
        set(14, creatorCreateType);
        set(15, creatorName);
        set(16, createdAt);
        set(17, updatedAt);
        set(18, status);
    }
}
