package com.inspirecamp7.myspringbootproject4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class MySpringBootProject4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(MySpringBootProject4Application.class, args);

        // 스프링에 등록된 DataSource 가져오기
        DataSource dataSource = context.getBean(DataSource.class);

        // 실제 DataSource 구현 클래스 이름 출력
        System.out.println(dataSource.getClass().getName());
    }

    @Bean
    public String helloBean() {
        return "Hello 스프링부트";
    }
}