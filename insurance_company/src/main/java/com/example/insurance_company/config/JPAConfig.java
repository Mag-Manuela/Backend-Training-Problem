package com.example.insurance_company.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"com.example.insurance_company.repositories"})
@EnableTransactionManagement
public class JPAConfig {

}
