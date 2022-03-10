package com.assaabloy.despachos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "pruebasEntityManagerFactory",transactionManagerRef = "PruebasTransactionManager",basePackages = {"com.assaabloy.despachos.repository"})
public class DbCongif {

    @Autowired
    private Environment env;
    @Bean(name = "userDataSource")
    public DataSource userDatasource(){
        DriverManagerDataSource dataSource =new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("dbpruebas.datasource.url"));
        dataSource.setUsername(env.getProperty("dbpruebas.datasource.username"));
        dataSource.setPassword(env.getProperty("dbpruebas.datasource.password"));
        dataSource.setDriverClassName(env.getProperty("dbpruebas.datasource.driverClassName"));
        return dataSource;
    }

    @Bean(name = "pruebasEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(userDatasource());
        em.setPackagesToScan("com.assaabloy.despachos.entity");
        HibernateJpaVendorAdapter vendorAdapter= new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String,Object> propiedades=new HashMap<>();
        propiedades.put("hibernate.show-sql",env.getProperty("dbpruebas.jpa.show-sql"));
        propiedades.put("hibernate.dialect",env.getProperty("dbpruebas.jpa.database-platform"));
        em.setJpaPropertyMap(propiedades);
        return em;
    }
    @Bean(name = "PruebasTransactionManager")
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager transactionManager =new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return  transactionManager;
    }

}
