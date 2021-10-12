package com.deloitte.weatherassessment.service;

import com.deloitte.weatherassessment.WeatherAssessmentApplication;
import com.deloitte.weatherassessment.api.spec.model.CitiesGetResponse;
import com.deloitte.weatherassessment.config.AppTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WeatherAssessmentApplication.class, AppTestConfig.class},
        webEnvironment = WebEnvironment.RANDOM_PORT, properties = "spring.main.allow-bean-definition-overriding=true")
@ActiveProfiles("local")
public class CitiesServiceTest {
    @Autowired
    CitiesService service;

    @Test
    public void test_retrieveCities() {
        CitiesGetResponse response = service.retrieveCities("countryName");
        

    }
}