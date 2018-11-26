/*
 * This file is generated by jOOQ.
*/
package com.agent.core.daos;


import com.agent.core.generated.tables.Platform;
import com.agent.core.generated.tables.records.PlatformRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 平台表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlatformDao extends DAOImpl<PlatformRecord, com.agent.core.pojos.Platform, ULong> {

    /**
     * Create a new PlatformDao without any configuration
     */
    public PlatformDao() {
        super(Platform.PLATFORM, com.agent.core.pojos.Platform.class);
    }

    /**
     * Create a new PlatformDao with an attached configuration
     */
    public PlatformDao(Configuration configuration) {
        super(Platform.PLATFORM, com.agent.core.pojos.Platform.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.agent.core.pojos.Platform object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchById(ULong... values) {
        return fetch(Platform.PLATFORM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.agent.core.pojos.Platform fetchOneById(ULong value) {
        return fetchOne(Platform.PLATFORM.ID, value);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByCode(String... values) {
        return fetch(Platform.PLATFORM.CODE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByName(String... values) {
        return fetch(Platform.PLATFORM.NAME, values);
    }

    /**
     * Fetch records that have <code>CREATED_DATE IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByCreatedDate(LocalDateTime... values) {
        return fetch(Platform.PLATFORM.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>update_date IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByUpdateDate(LocalDateTime... values) {
        return fetch(Platform.PLATFORM.UPDATE_DATE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByStatus(Integer... values) {
        return fetch(Platform.PLATFORM.STATUS, values);
    }

    /**
     * Fetch records that have <code>app_id IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByAppId(String... values) {
        return fetch(Platform.PLATFORM.APP_ID, values);
    }

    /**
     * Fetch records that have <code>qrcode_way IN (values)</code>
     */
    public List<com.agent.core.pojos.Platform> fetchByQrcodeWay(String... values) {
        return fetch(Platform.PLATFORM.QRCODE_WAY, values);
    }
}