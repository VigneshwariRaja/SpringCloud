package com.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootConfiguration
@EnableConfigServer
public class ConfigAppInit {

	public static void main(String[] args){
		SpringApplication.run(ConfigAppInit.class,args);
		
	}
}
