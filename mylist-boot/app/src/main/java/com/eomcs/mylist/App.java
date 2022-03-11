package com.eomcs.mylist;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

  @Value("${spring.datasource.driver-class-name}")
  String driverClassName;

  @Value("${spring.datasource.url}")
  String url;

  @Value("${spring.datasource.username}")
  String username;

  @Value("${spring.datasource.password}")
  String password;

  // Spring 프레임워크 (IoC = 객체풀)에서 객체를 생성한 후 보관하도록 만드는 방법
  @Bean 
  // => 스프링부트를 시작할 때 다음 메서드를 호출하게 만든다.
  // 이 메서드가 리턴한 값을 스프링 부트의 객체풀(object pool)에서 보관한다.
  //
  public DataSource createDataSource(
      @Value("${spring.datasource.driver-class-name}") String driverClassName,
      @Value("${spring.datasource.url}") String url,
      @Value("${spring.datasource.username}") String username,
      @Value("${spring.datasource.password}") String password) {

    try {
      DriverManagerDataSource connectionPool = new DriverManagerDataSource();
      connectionPool.setDriverClassName(driverClassName);
      connectionPool.setUrl(url);
      connectionPool.setUsername(username);
      connectionPool.setPassword(password);

      return connectionPool;

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

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
