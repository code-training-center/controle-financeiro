package com.codetrainingcenter.personalassistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class PersonalassistantApplication {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		System.out.println("Configurações iniciais");
		return "Configurações iniciais do projeto";
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonalassistantApplication.class, args);
	}
}
