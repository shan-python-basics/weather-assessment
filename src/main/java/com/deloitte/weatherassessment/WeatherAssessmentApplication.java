package com.deloitte.weatherassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties
public class WeatherAssessmentApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "local");
        SpringApplication.run(WeatherAssessmentApplication.class, args);
    }

}
