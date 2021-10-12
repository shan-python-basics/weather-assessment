package com.deloitte.weatherassessment.controller;

import com.deloitte.weatherassessment.api.spec.handler.RetrieveWeatherApi;
import com.deloitte.weatherassessment.api.spec.model.WeatherGetResponse;
import com.deloitte.weatherassessment.service.WeatherService;
import com.deloitte.weatherassessment.utils.Constants;
import com.deloitte.weatherassessment.utils.Constants.APIConstants;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = APIConstants.API_BASE_PATH)
public class RetrieveWeatherController implements RetrieveWeatherApi {
    private Logger logger = LoggerFactory.getLogger(RetrieveWeatherController.class);

    @Autowired
    private WeatherService service;
    @Override
    public ResponseEntity<WeatherGetResponse> retrieveWeather(
            @ApiParam(value = "Globally unique message identifier  - GUID" ,required=true) @RequestHeader(value="x-messageId", required=true) String xMessageId,
            @ApiParam(value = "City name for weather retrieval",required=true ) @PathVariable("cityName") String cityName,
            @ApiParam(value = "Country name for weather or cities retrieval",required=true ) @PathVariable("countryName") String countryName) {
        logger.info("START of retrieveWeather of class RetrieveWeatherController --> city {} country {}", cityName, countryName);
        WeatherGetResponse response = service.retrieveWeather(cityName, countryName);
        logger.info("END of retrieveWeather of class RetrieveWeatherController");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
