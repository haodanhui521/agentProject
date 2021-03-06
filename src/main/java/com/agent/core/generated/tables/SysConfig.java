/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables;


import com.agent.core.generated.Keys;
import com.agent.core.generated.PoppyAgent;
import com.agent.core.generated.tables.records.SysConfigRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class SysConfig extends TableImpl<SysConfigRecord> {

    private static final long serialVersionUID = -1840801529;

    /**
     * The reference instance of <code>poppy_agent.sys_config</code>
     */
    public static final SysConfig SYS_CONFIG = new SysConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysConfigRecord> getRecordType() {
        return SysConfigRecord.class;
    }

    /**
     * The column <code>poppy_agent.sys_config.id</code>.
     */
    public final TableField<SysConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>poppy_agent.sys_config.category</code>. 分类
     */
    public final TableField<SysConfigRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(30).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "分类");

    /**
     * The column <code>poppy_agent.sys_config.key</code>. key
     */
    public final TableField<SysConfigRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "key");

    /**
     * The column <code>poppy_agent.sys_config.value</code>. value
     */
    public final TableField<SysConfigRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "value");

    /**
     * The column <code>poppy_agent.sys_config.created_at</code>. 创建时间
     */
    public final TableField<SysConfigRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>poppy_agent.sys_config.updated_at</code>. 上次更新时间
     */
    public final TableField<SysConfigRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "上次更新时间");

    /**
     * The column <code>poppy_agent.sys_config.status</code>. normal:正常 disabled:关闭
     */
    public final TableField<SysConfigRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("normal", org.jooq.impl.SQLDataType.VARCHAR)), this, "normal:正常 disabled:关闭");

    /**
     * Create a <code>poppy_agent.sys_config</code> table reference
     */
    public SysConfig() {
        this("sys_config", null);
    }

    /**
     * Create an aliased <code>poppy_agent.sys_config</code> table reference
     */
    public SysConfig(String alias) {
        this(alias, SYS_CONFIG);
    }

    private SysConfig(String alias, Table<SysConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysConfig(String alias, Table<SysConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "配置");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PoppyAgent.POPPY_AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SysConfigRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysConfigRecord> getPrimaryKey() {
        return Keys.KEY_SYS_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<SysConfigRecord>>asList(Keys.KEY_SYS_CONFIG_PRIMARY, Keys.KEY_SYS_CONFIG_IDX_CATEGORY_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfig as(String alias) {
        return new SysConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(String name) {
        return new SysConfig(name, null);
    }
}
