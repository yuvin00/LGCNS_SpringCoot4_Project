package com.inspirecamp7.myspringbootproject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
public class MySpringBootProject4Application {

    public static void main(String[] args) {
        //SpringApplication.run(MySpringBootProject4Application.class, args);
        SpringApplication application = new SpringApplication(MySpringBootProject4Application.class);
        //WebApplication Type 설정하기
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }

    @Bean
    public String helloBean() {
        return new String("Hello 스프링부트");
    }
}