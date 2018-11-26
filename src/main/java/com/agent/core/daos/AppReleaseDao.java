/*
 * This file is generated by jOOQ.
*/
package com.agent.core.daos;


import com.agent.core.generated.tables.AppRelease;
import com.agent.core.generated.tables.records.AppReleaseRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppReleaseDao extends DAOImpl<AppReleaseRecord, com.agent.core.pojos.AppRelease, ULong> {

    /**
     * Create a new AppReleaseDao without any configuration
     */
    public AppReleaseDao() {
        super(AppRelease.APP_RELEASE, com.agent.core.pojos.AppRelease.class);
    }

    /**
     * Create a new AppReleaseDao with an attached configuration
     */
    public AppReleaseDao(Configuration configuration) {
        super(AppRelease.APP_RELEASE, com.agent.core.pojos.AppRelease.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.agent.core.pojos.AppRelease object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchById(ULong... values) {
        return fetch(AppRelease.APP_RELEASE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.agent.core.pojos.AppRelease fetchOneById(ULong value) {
        return fetchOne(AppRelease.APP_RELEASE.ID, value);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByStatus(Integer... values) {
        return fetch(AppRelease.APP_RELEASE.STATUS, values);
    }

    /**
     * Fetch records that have <code>APP_TYPE IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByAppType(String... values) {
        return fetch(AppRelease.APP_RELEASE.APP_TYPE, values);
    }

    /**
     * Fetch records that have <code>APP_VERSION IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByAppVersion(String... values) {
        return fetch(AppRelease.APP_RELEASE.APP_VERSION, values);
    }

    /**
     * Fetch records that have <code>APP_ADDRESS IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByAppAddress(String... values) {
        return fetch(AppRelease.APP_RELEASE.APP_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>EFFECT_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByEffectTime(LocalDateTime... values) {
        return fetch(AppRelease.APP_RELEASE.EFFECT_TIME, values);
    }

    /**
     * Fetch records that have <code>UPDATE_DESC IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByUpdateDesc(String... values) {
        return fetch(AppRelease.APP_RELEASE.UPDATE_DESC, values);
    }

    /**
     * Fetch records that have <code>LIMIT_VERSION IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByLimitVersion(String... values) {
        return fetch(AppRelease.APP_RELEASE.LIMIT_VERSION, values);
    }

    /**
     * Fetch records that have <code>CREATED_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByCreatedTime(LocalDateTime... values) {
        return fetch(AppRelease.APP_RELEASE.CREATED_TIME, values);
    }

    /**
     * Fetch records that have <code>UPDATE_TIME IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(AppRelease.APP_RELEASE.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>CREATOR IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByCreator(String... values) {
        return fetch(AppRelease.APP_RELEASE.CREATOR, values);
    }

    /**
     * Fetch records that have <code>MODIFIER IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByModifier(String... values) {
        return fetch(AppRelease.APP_RELEASE.MODIFIER, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code>
     */
    public List<com.agent.core.pojos.AppRelease> fetchByAppId(String... values) {
        return fetch(AppRelease.APP_RELEASE.APP_ID, values);
    }
}