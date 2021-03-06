package com.connecto.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.connecto.domain"})
@EnableJpaRepositories(basePackages = {"com.connecto.repository"})
@EnableTransactionManagement
@PropertySource(value = {"classpath:application.properties"})
public class RepositoryConfiguration {


}
