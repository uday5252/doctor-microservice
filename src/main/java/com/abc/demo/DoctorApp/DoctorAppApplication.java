package com.abc.demo.DoctorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DoctorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorAppApplication.class, args);
	}
	
//	create the object for RestTemplate and give it to S.B
//	if a S.B has to maintan any object ==> inside a method
	
	@LoadBalanced 
	@Bean
	public RestTemplate template()
	{
		return new RestTemplate();
	}
	
	

//	@Bean
//	public WebClient webClient()
//	{
////		WebClient ==> Interface
//		
//		return WebClient.builder().build();
//	}
	
	

}
