package com.revature.revpro.organizationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(
        basePackageClasses = {OrganizationApiApplication.class, Jsr310JpaConverters.class}
)
@PropertySource({ "classpath:organization-module.properties" })
@EnableResourceServer
@EnableOAuth2Client
public class OrganizationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationApiApplication.class, args);
	}
}
