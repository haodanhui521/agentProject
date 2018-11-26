/*
 * This file is generated by jOOQ.
*/
package com.agent.core.daos;


import com.agent.core.generated.tables.Machine;
import com.agent.core.generated.tables.records.MachineRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;


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
public class MachineDao extends DAOImpl<MachineRecord, com.agent.core.pojos.Machine, ULong> {

    /**
     * Create a new MachineDao without any configuration
     */
    public MachineDao() {
        super(Machine.MACHINE, com.agent.core.pojos.Machine.class);
    }

    /**
     * Create a new MachineDao with an attached configuration
     */
    public MachineDao(Configuration configuration) {
        super(Machine.MACHINE, com.agent.core.pojos.Machine.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.agent.core.pojos.Machine object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchById(ULong... values) {
        return fetch(Machine.MACHINE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.agent.core.pojos.Machine fetchOneById(ULong value) {
        return fetchOne(Machine.MACHINE.ID, value);
    }

    /**
     * Fetch records that have <code>MERCHANT_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByMerchantId(String... values) {
        return fetch(Machine.MACHINE.MERCHANT_ID, values);
    }

    /**
     * Fetch records that have <code>MACHINE_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByMachineId(String... values) {
        return fetch(Machine.MACHINE.MACHINE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>MACHINE_ID = value</code>
     */
    public com.agent.core.pojos.Machine fetchOneByMachineId(String value) {
        return fetchOne(Machine.MACHINE.MACHINE_ID, value);
    }

    /**
     * Fetch records that have <code>MACHINE_NAME IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByMachineName(String... values) {
        return fetch(Machine.MACHINE.MACHINE_NAME, values);
    }

    /**
     * Fetch records that have <code>ENABLE_STATUS IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByEnableStatus(Integer... values) {
        return fetch(Machine.MACHINE.ENABLE_STATUS, values);
    }

    /**
     * Fetch records that have <code>HEART_STATUS IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByHeartStatus(Integer... values) {
        return fetch(Machine.MACHINE.HEART_STATUS, values);
    }

    /**
     * Fetch records that have <code>MACHINE_INFO IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByMachineInfo(String... values) {
        return fetch(Machine.MACHINE.MACHINE_INFO, values);
    }

    /**
     * Fetch records that have <code>KEY_CONTENT IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByKeyContent(String... values) {
        return fetch(Machine.MACHINE.KEY_CONTENT, values);
    }

    /**
     * Fetch records that have <code>KEY_TYPE IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByKeyType(String... values) {
        return fetch(Machine.MACHINE.KEY_TYPE, values);
    }

    /**
     * Fetch records that have <code>ACCOUNT_TYPE IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByAccountType(String... values) {
        return fetch(Machine.MACHINE.ACCOUNT_TYPE, values);
    }

    /**
     * Fetch records that have <code>LINE_ACCOUNT IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByLineAccount(String... values) {
        return fetch(Machine.MACHINE.LINE_ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>ISDELETED IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByIsdeleted(Integer... values) {
        return fetch(Machine.MACHINE.ISDELETED, values);
    }

    /**
     * Fetch records that have <code>CREATED_DATE IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByCreatedDate(LocalDateTime... values) {
        return fetch(Machine.MACHINE.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>UPDATE_DATE IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByUpdateDate(LocalDateTime... values) {
        return fetch(Machine.MACHINE.UPDATE_DATE, values);
    }

    /**
     * Fetch records that have <code>app_id IN (values)</code>
     */
    public List<com.agent.core.pojos.Machine> fetchByAppId(String... values) {
        return fetch(Machine.MACHINE.APP_ID, values);
    }
}