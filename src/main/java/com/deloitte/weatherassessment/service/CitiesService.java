package com.deloitte.weatherassessment.service;

import com.deloitte.weatherassessment.api.spec.model.CitiesGetResponse;
import com.deloitte.weatherassessment.api.spec.model.CitiesGetResponseData;
import com.deloitte.weatherassessment.utils.ExceptionUtil;
import net.webservicex.GlobalWeatherHttpGet;
import net.webservicex.GlobalWeatherHttpPost;
import net.webservicex.GlobalWeatherSoap;
import org.apache.commons.text.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

@Service
public class CitiesService {
    private Logger logger = LoggerFactory.getLogger(CitiesService.class);

    @Autowired
    @Qualifier("GlobalWeatherSoap")
    private GlobalWeatherSoap servicePort;

    @Autowired
    private ExceptionUtil exceptionUtil;

    public CitiesGetResponse retrieveCities(String countryName) {
        logger.info("START of retrieveCities of class CitiesService");
        try {
            if (logger.isDebugEnabled()) {
                logger.debug("Global weather soap request countryName --> {}", countryName);
            }
            String soapResponse = servicePort.getCitiesByCountry(countryName);
            String data = parseCDataToString(soapResponse);
            System.out.println(data);
            if (logger.isDebugEnabled()) {
                logger.debug("Global weather soap final response  {}", soapResponse);
            }
        } catch (Exception e) {
            logger.error("Error when sending global weather soap request{}", e.getLocalizedMessage());
            throw exceptionUtil.createBaseCustomException(e);
        }

        return new CitiesGetResponse();
    }


    private CitiesGetResponseData parseCData(String cData) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(CitiesGetResponseData.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StreamSource streamSource = new StreamSource(new StringReader(cData));
        JAXBElement<CitiesGetResponseData> je = unmarshaller.unmarshal(streamSource, CitiesGetResponseData.class);

        return je.getValue();
    }

    private String parseCDataToString(String cData) {
        String unEscaped = StringEscapeUtils.unescapeHtml4(cData);
        System.out.println(unEscaped);
        return unEscaped;
    }
}
