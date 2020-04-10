package com.tms.issuelist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IssuelistApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuelistApplication.class, args);
	}

}
