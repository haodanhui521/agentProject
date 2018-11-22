/*
 * This file is generated by jOOQ.
*/
package com.agent.core.generated.tables;


import com.agent.core.generated.IfpayCcpay;
import com.agent.core.generated.Keys;
import com.agent.core.generated.tables.records.TradeInfoRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class TradeInfo extends TableImpl<TradeInfoRecord> {

    private static final long serialVersionUID = -256137151;

    /**
     * The reference instance of <code>ifpay_ccpay.trade_info</code>
     */
    public static final TradeInfo TRADE_INFO = new TradeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TradeInfoRecord> getRecordType() {
        return TradeInfoRecord.class;
    }

    /**
     * The column <code>ifpay_ccpay.trade_info.ID</code>.
     */
    public final TableField<TradeInfoRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ifpay_ccpay.trade_info.TRADE_NO</code>. 交易订单号
     */
    public final TableField<TradeInfoRecord, String> TRADE_NO = createField("TRADE_NO", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "交易订单号");

    /**
     * The column <code>ifpay_ccpay.trade_info.MERCHANT_NO</code>. 商户号
     */
    public final TableField<TradeInfoRecord, String> MERCHANT_NO = createField("MERCHANT_NO", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "商户号");

    /**
     * The column <code>ifpay_ccpay.trade_info.PLATFORM</code>. 平台类型（支付宝：ALIPAY,...）
     */
    public final TableField<TradeInfoRecord, String> PLATFORM = createField("PLATFORM", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "平台类型（支付宝：ALIPAY,...）");

    /**
     * The column <code>ifpay_ccpay.trade_info.TRADE_AMOUNT</code>. 交易金额(单位：分)
     */
    public final TableField<TradeInfoRecord, BigInteger> TRADE_AMOUNT = createField("TRADE_AMOUNT", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(50).nullable(false), this, "交易金额(单位：分)");

    /**
     * The column <code>ifpay_ccpay.trade_info.IP</code>. IP地址
     */
    public final TableField<TradeInfoRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "IP地址");

    /**
     * The column <code>ifpay_ccpay.trade_info.SUBMIT_TIME</code>. 提交时间
     */
    public final TableField<TradeInfoRecord, Timestamp> SUBMIT_TIME = createField("SUBMIT_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "提交时间");

    /**
     * The column <code>ifpay_ccpay.trade_info.CREATE_TIME</code>. 创建时间
     */
    public final TableField<TradeInfoRecord, Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>ifpay_ccpay.trade_info.DONE_TIME</code>. 交易完成时间
     */
    public final TableField<TradeInfoRecord, Timestamp> DONE_TIME = createField("DONE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "交易完成时间");

    /**
     * The column <code>ifpay_ccpay.trade_info.UPDATE_TIME</code>. 最近更新时间
     */
    public final TableField<TradeInfoRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最近更新时间");

    /**
     * The column <code>ifpay_ccpay.trade_info.TRADE_STATUS</code>. 交易状态
(
initial：初始状态, processing：返码待支付，
failed：失败
，success：成功
     */
    public final TableField<TradeInfoRecord, String> TRADE_STATUS = createField("TRADE_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "交易状态\r\n(\r\ninitial：初始状态, processing：返码待支付，\r\nfailed：失败\r\n，success：成功");

    /**
     * The column <code>ifpay_ccpay.trade_info.TRADE_ERRCODE</code>. 交易错误
     */
    public final TableField<TradeInfoRecord, String> TRADE_ERRCODE = createField("TRADE_ERRCODE", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "交易错误");

    /**
     * The column <code>ifpay_ccpay.trade_info.TRADE_ERRMSG</code>. 交易错误信息
     */
    public final TableField<TradeInfoRecord, String> TRADE_ERRMSG = createField("TRADE_ERRMSG", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "交易错误信息");

    /**
     * The column <code>ifpay_ccpay.trade_info.SEQ_ID</code>. 上游订单号
     */
    public final TableField<TradeInfoRecord, String> SEQ_ID = createField("SEQ_ID", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "上游订单号");

    /**
     * The column <code>ifpay_ccpay.trade_info.QR_CODE</code>. 返码
     */
    public final TableField<TradeInfoRecord, String> QR_CODE = createField("QR_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "返码");

    /**
     * The column <code>ifpay_ccpay.trade_info.NOTIFY_STATUS</code>. 通知状态 success:成功，processing:待通知
     */
    public final TableField<TradeInfoRecord, String> NOTIFY_STATUS = createField("NOTIFY_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "通知状态 success:成功，processing:待通知");

    /**
     * The column <code>ifpay_ccpay.trade_info.DEVICE_ID</code>. 设备ID
     */
    public final TableField<TradeInfoRecord, String> DEVICE_ID = createField("DEVICE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "设备ID");

    /**
     * The column <code>ifpay_ccpay.trade_info.merchant_trade_no</code>. 商户订单号
     */
    public final TableField<TradeInfoRecord, String> MERCHANT_TRADE_NO = createField("merchant_trade_no", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "商户订单号");

    /**
     * The column <code>ifpay_ccpay.trade_info.notify_url</code>. 通知地址
     */
    public final TableField<TradeInfoRecord, String> NOTIFY_URL = createField("notify_url", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "通知地址");

    /**
     * The column <code>ifpay_ccpay.trade_info.PAYEE_ACCOUNT_NO</code>. 收款账号
     */
    public final TableField<TradeInfoRecord, String> PAYEE_ACCOUNT_NO = createField("PAYEE_ACCOUNT_NO", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "收款账号");

    /**
     * The column <code>ifpay_ccpay.trade_info.method</code>. 支付方式：H5/WEB
     */
    public final TableField<TradeInfoRecord, String> METHOD = createField("method", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "支付方式：H5/WEB");

    /**
     * The column <code>ifpay_ccpay.trade_info.APP_ID</code>.
     */
    public final TableField<TradeInfoRecord, String> APP_ID = createField("APP_ID", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>ifpay_ccpay.trade_info.QRCODE_NUM</code>. 二维码号, CC-time-Seq
     */
    public final TableField<TradeInfoRecord, String> QRCODE_NUM = createField("QRCODE_NUM", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "二维码号, CC-time-Seq");

    /**
     * Create a <code>ifpay_ccpay.trade_info</code> table reference
     */
    public TradeInfo() {
        this("trade_info", null);
    }

    /**
     * Create an aliased <code>ifpay_ccpay.trade_info</code> table reference
     */
    public TradeInfo(String alias) {
        this(alias, TRADE_INFO);
    }

    private TradeInfo(String alias, Table<TradeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TradeInfo(String alias, Table<TradeInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "交易订单表");
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
    public Identity<TradeInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRADE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TradeInfoRecord> getPrimaryKey() {
        return Keys.KEY_TRADE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TradeInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TradeInfoRecord>>asList(Keys.KEY_TRADE_INFO_PRIMARY, Keys.KEY_TRADE_INFO_TRADE_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TradeInfo as(String alias) {
        return new TradeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TradeInfo rename(String name) {
        return new TradeInfo(name, null);
    }
}