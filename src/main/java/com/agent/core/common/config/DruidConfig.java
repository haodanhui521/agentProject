package com.agent.core.common.config;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import java.sql.SQLException;

/**
 * Created on 5/3/17.
 *
 * @author hackerli
 */
@Configuration
public class DruidConfig {
    private static final String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKNRtGfEJRMnBbQmdPzXIsA4ubFTElenR8oEAK0Y/auFgVQ+XQmJnizFbrMzr/yPTde9wvn5A0/quZkYNHhjGxECAwEAAQ==";
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.druid.initialSize}")
    private int initialSize;
    @Value("${spring.datasource.druid.maxActive}")
    private int maxActive;
    @Value("${spring.datasource.druid.minIdle}")
    private int minIdle;
    @Value("${spring.datasource.druid.maxWait}")
    private int maxWait;
    @Value("${spring.datasource.druid.timeBetweenEvictionRunsMillis:60000}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.druid.minEvictableIdleTimeMillis:300000}")
    private int minEvictableIdleTimeMillis;
    @Value("${spring.datasource.druid.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.druid.testWhileIdle:true}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.druid.testOnBorrow:false}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.druid.testOnReturn:false}")
    private boolean testOnReturn;
    @Value("${spring.datasource.druid.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.druid.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.druid.filters}")
    private String filters;
    @Value("${spring.datasource.druid.connectionProperties:}")
    private String connectionProperties;
    @Value("${spring.datasource.druid.useGlobalDataSourceStat:false}")
    private boolean useGlobalDataSourceStat;

    @Autowired
    private ExecuteListenerProvider[] executeListenerProviders;

    /**
     * Druid数据源配置
     *
     * @return
     * @throws SQLException
     * @see <a href="https://github.com/alibaba/druid/wiki/配置_DruidDataSource参考配置">DruidDataSource参考配置</a>
     */
    @Bean
    public DruidDataSource druidDataSource() throws Exception {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(ConfigTools.decrypt(publicKey, username));
        druidDataSource.setPassword(ConfigTools.decrypt(publicKey, password));
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestOnReturn(testOnReturn);
        druidDataSource.setPoolPreparedStatements(poolPreparedStatements);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        druidDataSource.setFilters(filters);
        druidDataSource.setConnectionProperties(connectionProperties);
        druidDataSource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        return druidDataSource;
    }

    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("/druid/*");
        reg.addInitParameter("allow", "127.0.0.1"); //白名单
        //reg.addInitParameter("deny",""); //黑名单
        reg.addInitParameter("loginUsername", "druid");
        reg.addInitParameter("loginPassword", "druid");
        return reg;
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider() throws Exception {
        return new DataSourceConnectionProvider
                (new TransactionAwareDataSourceProxy(druidDataSource()));
    }

    @Bean
    public DefaultDSLContext dsl() throws Exception {
        return new DefaultDSLContext(configuration());
    }

    public DefaultConfiguration configuration() throws Exception {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(executeListenerProviders);
        jooqConfiguration.set(SQLDialect.MYSQL);
        return jooqConfiguration;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
