package com.deloitte.weatherassessment.controller;

import com.deloitte.weatherassessment.api.spec.handler.RetrieveCitiesApi;
import com.deloitte.weatherassessment.api.spec.model.CitiesGetResponse;
import com.deloitte.weatherassessment.service.CitiesService;
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
public class RetrieveCitiesController implements RetrieveCitiesApi {
    private Logger logger = LoggerFactory.getLogger(RetrieveCitiesController.class);

    @Autowired
    private CitiesService service;

    @Override
    public ResponseEntity<CitiesGetResponse> retrieveCities(
            @ApiParam(value = "Globally unique message identifier  - GUID" ,required=true) @RequestHeader(value="x-messageId", required=true) String xMessageId,
            @ApiParam(value = "Country name for weather or cities retrieval",required=true ) @PathVariable("countryName") String countryName) {
        logger.info("START of retrieveCities of class RetrieveCitiesController --> item {}", countryName);
        CitiesGetResponse response = service.retrieveCities(countryName);
        logger.info("End of retrieveCities of class RetrieveCitiesController");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
