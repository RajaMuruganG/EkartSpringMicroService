package com.productinfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig {

	@Bean
	RestClient.Builder builder(){
		return RestClient.builder();
	}
}
