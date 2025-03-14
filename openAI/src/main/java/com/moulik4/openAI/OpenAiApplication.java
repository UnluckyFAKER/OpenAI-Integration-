package com.moulik4.openAI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OpenAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenAiApplication.class, args);

	}
	@Value("${open.Ai.key}")
	private String OpenAi;
	@Bean
	public RestTemplate restTemplate(){
		RestTemplate restTemplate= new RestTemplate();
		//define the external Api
		restTemplate.getInterceptors().add(((request, body, execution) -> {
			request.getHeaders().add("Authorization","Bearer "+"sk-1234efgh5678ijkl1234efgh5678ijkl1234efgh");
			return execution.execute(request,body);
		}));
		return restTemplate;

	}

}
