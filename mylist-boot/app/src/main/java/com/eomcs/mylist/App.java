package com.eomcs.mylist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args); // class는 내장 변수. 자바의 모든 클래스가 다 가지고 있음

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext beanContainer) { // ApplicationContext : 자동완성에서 스프링부트 프레임워크 껄로 선택
		return args -> {

			System.out.println("빈 컨테이너가 생성한 객체(빈 컨테이너에 들어 있는 객체):");

			String[] beanNames = beanContainer.getBeanDefinitionNames();
			for (int i = 0; i < beanNames.length; i++) {
				Object bean = beanContainer.getBean(beanNames[i]);
				System.out.printf("----> %03d : %s\n", i + 1, bean.getClass().getName());
			}

		};
	}


	@RequestMapping("/hello")
	String hello() {
		return "Hello World!";
	}

}
