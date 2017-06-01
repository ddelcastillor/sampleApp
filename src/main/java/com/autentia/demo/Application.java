package com.autentia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.autentia.demo")
public class Application {

    private static SpringApplication app = new SpringApplication(Application.class);

    public static void main(String[] args) {
        app.run(args);
    }

    public static void setApp(SpringApplication app) {
    	Application.app = app;
    }

}
