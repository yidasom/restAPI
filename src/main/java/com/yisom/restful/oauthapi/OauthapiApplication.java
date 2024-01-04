package com.yisom.restful.oauthapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OauthapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthapiApplication.class, args);
    }

}
