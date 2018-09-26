package com.example.techblo.techblo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@RestController
public class TechbloApplication {
	
	@Autowired
	BlogDetails bd;
	@RequestMapping("/getblogs")
    public String home() {
		String result=null;
		try {
			bd.setBlogName("docker");
			bd.setTech("cloud");
			ObjectMapper objectMapper = new ObjectMapper();
			result = objectMapper.writeValueAsString(bd);
		} catch (JsonProcessingException e) {
			return "error";
		}
            return result;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TechbloApplication.class, args);
	}
}
