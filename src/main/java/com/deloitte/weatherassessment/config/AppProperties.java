package com.deloitte.weatherassessment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AppProperties {
    @Value("${globalWeatherSoap.endpoint}")
    private String globalWeatherSoapEndpoint;

    @Value("${globalWeatherSoap.timeout.socketTimeout}")
    private String globalWeatherSocketTimeout;
    @Value("${globalWeatherSoap.timeout.connectionTimeout}")
    private String globalWeatherConnectionTimeout;

    public String getGlobalWeatherSoapEndpoint() {
        return globalWeatherSoapEndpoint;
    }

    public String getGlobalWeatherSocketTimeout() {
        return globalWeatherSocketTimeout;
    }

    public String getGlobalWeatherConnectionTimeout() {
        return globalWeatherConnectionTimeout;
    }
}
