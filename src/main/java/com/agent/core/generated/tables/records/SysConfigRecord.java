/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables.records;


import com.agent.core.generated.tables.SysConfig;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 配置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysConfigRecord extends UpdatableRecordImpl<SysConfigRecord> implements Record7<Long, String, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1328839754;

    /**
     * Setter for <code>poppy_agent.sys_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.category</code>. 分类
     */
    public void setCategory(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.category</code>. 分类
     */
    public String getCategory() {
        return (String) get(1);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.key</code>. key
     */
    public void setKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.key</code>. key
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.value</code>. value
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.value</code>. value
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.created_at</code>. 创建时间
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.updated_at</code>. 上次更新时间
     */
    public void setUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.updated_at</code>. 上次更新时间
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>poppy_agent.sys_config.status</code>. normal:正常 disabled:关闭
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>poppy_agent.sys_config.status</code>. normal:正常 disabled:关闭
     */
    public String getStatus() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SysConfig.SYS_CONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysConfig.SYS_CONFIG.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysConfig.SYS_CONFIG.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysConfig.SYS_CONFIG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return SysConfig.SYS_CONFIG.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SysConfig.SYS_CONFIG.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysConfig.SYS_CONFIG.STATUS;
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value2(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value3(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value7(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysConfigRecord
     */
    public SysConfigRecord() {
        super(SysConfig.SYS_CONFIG);
    }

    /**
     * Create a detached, initialised SysConfigRecord
     */
    public SysConfigRecord(Long id, String category, String key, String value, Timestamp createdAt, Timestamp updatedAt, String status) {
        super(SysConfig.SYS_CONFIG);

        set(0, id);
        set(1, category);
        set(2, key);
        set(3, value);
        set(4, createdAt);
        set(5, updatedAt);
        set(6, status);
    }
}