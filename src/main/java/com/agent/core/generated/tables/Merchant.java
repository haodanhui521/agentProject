/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables;


import com.agent.core.generated.IfpayCcpay;
import com.agent.core.generated.Keys;
import com.agent.core.generated.tables.records.MerchantRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class Merchant extends TableImpl<MerchantRecord> {

    private static final long serialVersionUID = -551382403;

    /**
     * The reference instance of <code>ifpay_ccpay.merchant</code>
     */
    public static final Merchant MERCHANT = new Merchant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MerchantRecord> getRecordType() {
        return MerchantRecord.class;
    }

    /**
     * The column <code>ifpay_ccpay.merchant.ID</code>. 主键ID
     */
    public final TableField<MerchantRecord, ULong> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "主键ID");

    /**
     * The column <code>ifpay_ccpay.merchant.MERCHANT_ID</code>. 商户号
     */
    public final TableField<MerchantRecord, String> MERCHANT_ID = createField("MERCHANT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商户号");

    /**
     * The column <code>ifpay_ccpay.merchant.MERCHANT_NAME</code>. 商户名称
     */
    public final TableField<MerchantRecord, String> MERCHANT_NAME = createField("MERCHANT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "商户名称");

    /**
     * The column <code>ifpay_ccpay.merchant.LOGIN_NO</code>. 登录账号
     */
    public final TableField<MerchantRecord, String> LOGIN_NO = createField("LOGIN_NO", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "登录账号");

    /**
     * The column <code>ifpay_ccpay.merchant.ISDELETED</code>. 1: deleted, 0: normal
     */
    public final TableField<MerchantRecord, Integer> ISDELETED = createField("ISDELETED", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "1: deleted, 0: normal");

    /**
     * The column <code>ifpay_ccpay.merchant.CREATED_TIME</code>. 创建时间
     */
    public final TableField<MerchantRecord, Timestamp> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ifpay_ccpay.merchant.UPDATE_TIME</code>. 修改时间
     */
    public final TableField<MerchantRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>ifpay_ccpay.merchant.SIGN_KEY</code>. 密钥
     */
    public final TableField<MerchantRecord, String> SIGN_KEY = createField("SIGN_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "密钥");

    /**
     * The column <code>ifpay_ccpay.merchant.MOBILE</code>. 手机号
     */
    public final TableField<MerchantRecord, String> MOBILE = createField("MOBILE", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "手机号");

    /**
     * The column <code>ifpay_ccpay.merchant.EMAIL</code>. 邮箱
     */
    public final TableField<MerchantRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "邮箱");

    /**
     * The column <code>ifpay_ccpay.merchant.app_id</code>.
     */
    public final TableField<MerchantRecord, String> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>ifpay_ccpay.merchant.note</code>. 备注
     */
    public final TableField<MerchantRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "备注");

    /**
     * Create a <code>ifpay_ccpay.merchant</code> table reference
     */
    public Merchant() {
        this("merchant", null);
    }

    /**
     * Create an aliased <code>ifpay_ccpay.merchant</code> table reference
     */
    public Merchant(String alias) {
        this(alias, MERCHANT);
    }

    private Merchant(String alias, Table<MerchantRecord> aliased) {
        this(alias, aliased, null);
    }

    private Merchant(String alias, Table<MerchantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商户表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return IfpayCcpay.IFPAY_CCPAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MerchantRecord, ULong> getIdentity() {
        return Keys.IDENTITY_MERCHANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MerchantRecord> getPrimaryKey() {
        return Keys.KEY_MERCHANT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MerchantRecord>> getKeys() {
        return Arrays.<UniqueKey<MerchantRecord>>asList(Keys.KEY_MERCHANT_PRIMARY, Keys.KEY_MERCHANT_MERCHANT_ID, Keys.KEY_MERCHANT_MERCHANT_MERCHANT_NAME_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Merchant as(String alias) {
        return new Merchant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Merchant rename(String name) {
        return new Merchant(name, null);
    }
}
