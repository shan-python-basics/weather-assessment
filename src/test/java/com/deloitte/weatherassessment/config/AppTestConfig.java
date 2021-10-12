package com.deloitte.weatherassessment.config;

import com.deloitte.weatherassessment.mock.GlobalWeatherSoapImpl;
import net.webservicex.GlobalWeatherSoap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class AppTestConfig {
    @Bean
    @Primary
    @Qualifier("GlobalWeatherSoap")
    public GlobalWeatherSoap globalWeatherSoap() {
        return new GlobalWeatherSoapImpl();
    }
}
