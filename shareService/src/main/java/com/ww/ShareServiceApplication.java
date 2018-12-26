package com.ww;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShareServiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new SpringApplicationBuilder(ShareServiceApplication.class).web(true).run(args);
	}

}
