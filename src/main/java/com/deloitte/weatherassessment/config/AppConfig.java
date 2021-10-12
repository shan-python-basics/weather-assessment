package com.deloitte.weatherassessment.config;

import net.webservicex.GlobalWeatherHttpGet;
import net.webservicex.GlobalWeatherHttpPost;
import net.webservicex.GlobalWeatherSoap;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class AppConfig {
    @Autowired
    private AppProperties properties;

    @Bean
    @Qualifier("GlobalWeatherSoap")
    public GlobalWeatherSoap globalWeatherSoap() {
        JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
        proxy.setServiceClass(GlobalWeatherSoap.class);
        proxy.setAddress(properties.getGlobalWeatherSoapEndpoint());
        GlobalWeatherSoap globalWeatherSoap = (GlobalWeatherSoap) proxy.create();
        Client client = ClientProxy.getClient(globalWeatherSoap);

        if (client != null) {
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            if (!StringUtils.isBlank(properties.getGlobalWeatherSocketTimeout()) &&
                    StringUtils.isNoneBlank(properties.getGlobalWeatherConnectionTimeout())) {
                this.configurePolicy(conduit);
            }
        }
        return globalWeatherSoap;
    }

    @Bean
    public GlobalWeatherHttpGet globalWeatherHttpGet() {
        JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
        proxy.setServiceClass(GlobalWeatherHttpGet.class);
        proxy.setAddress(properties.getGlobalWeatherSoapEndpoint());
        GlobalWeatherHttpGet globalWeatherSoap = (GlobalWeatherHttpGet) proxy.create();
        Client client = ClientProxy.getClient(globalWeatherSoap);

        if (client != null) {
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            if (!StringUtils.isBlank(properties.getGlobalWeatherSocketTimeout()) &&
                    StringUtils.isNoneBlank(properties.getGlobalWeatherConnectionTimeout())) {
                this.configurePolicy(conduit);
            }
        }
        return globalWeatherSoap;
    }

    @Bean
    public GlobalWeatherHttpPost globalWeatherHttpPost() {
        JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
        proxy.setServiceClass(GlobalWeatherHttpPost.class);
        proxy.setAddress(properties.getGlobalWeatherSoapEndpoint());
        GlobalWeatherHttpPost globalWeatherSoap = (GlobalWeatherHttpPost) proxy.create();
        Client client = ClientProxy.getClient(globalWeatherSoap);

        if (client != null) {
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            if (!StringUtils.isBlank(properties.getGlobalWeatherSocketTimeout()) &&
                    StringUtils.isNoneBlank(properties.getGlobalWeatherConnectionTimeout())) {
                this.configurePolicy(conduit);
            }
        }
        return globalWeatherSoap;
    }

    private void configurePolicy(HTTPConduit conduit) {
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(Integer.parseInt(properties.getGlobalWeatherConnectionTimeout()));
        policy.setReceiveTimeout(Integer.parseInt(properties.getGlobalWeatherSocketTimeout()));
        conduit.setClient(policy);
    }
}
