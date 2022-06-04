package com.example.mysearchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MySearchApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySearchApiApplication.class, args);
    }

}
