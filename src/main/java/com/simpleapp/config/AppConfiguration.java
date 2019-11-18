package com.simpleapp.config;


import com.simpleapp.dao.EmployeeDao;
import com.simpleapp.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    @Resource
    private Environment environment;

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(environment.getRequiredProperty("application.url"));
        dataSource.setDriverClassName(environment.getRequiredProperty("application.driver"));
        dataSource.setUsername(environment.getRequiredProperty("application.username"));
        dataSource.setPassword(environment.getRequiredProperty("application.passward"));

        return dataSource;
    }

    @Bean
    public EmployeeDao getEmployeeDao() {
        return new EmployeeDao(getJdbcTemplate());
    }
}
