package com.deloitte.weatherassessment.service;

import com.deloitte.weatherassessment.api.spec.model.CitiesGetResponse;
import com.deloitte.weatherassessment.api.spec.model.WeatherGetResponse;
import com.deloitte.weatherassessment.utils.ExceptionUtil;
import net.webservicex.GlobalWeatherHttpGet;
import net.webservicex.GlobalWeatherHttpPost;
import net.webservicex.GlobalWeatherSoap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private Logger logger = LoggerFactory.getLogger(WeatherService.class);

    @Autowired
    private GlobalWeatherSoap servicePort;

    @Autowired
    GlobalWeatherHttpGet globalWeatherHttpGet;

    @Autowired
    private ExceptionUtil exceptionUtil;

    public WeatherGetResponse retrieveWeather(String cityName, String countryName) {
        logger.info("START of retrieveWeather of class WeatherService");
        try {
            if (logger.isDebugEnabled()) {
                logger.debug("Global weather soap request countryName --> {}", countryName);
            }
            String soapResponse = globalWeatherHttpGet.getWeather(cityName, countryName);
            if (logger.isDebugEnabled()) {
                logger.debug("Global weather soap final response  {}", soapResponse);
            }
        } catch (Exception e) {
            logger.error("Error when sending global weather soap request{}", e.getLocalizedMessage());
            throw exceptionUtil.createBaseCustomException(e);
        }

        return new WeatherGetResponse();
    }
}
