package com.seanxie.hotelreservation.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.seanxie.hotelreservation.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
