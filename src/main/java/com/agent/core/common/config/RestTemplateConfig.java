package com.agent.core.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Service
public class RestTemplateConfig {

    @Value("${spring.http.shortConnectTimeout:10000}")
    private int shortConnectTimeout;
    @Value("${spring.http.shortReadTimeout:10000}")
    private int shortReadTimeout;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = getUTF8StringHttpMessageConverterRestTemplate();
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setConnectTimeout(shortConnectTimeout);
        simpleClientHttpRequestFactory.setReadTimeout(shortReadTimeout);
        restTemplate.setRequestFactory(simpleClientHttpRequestFactory);
        return restTemplate;
    }

    private RestTemplate getUTF8StringHttpMessageConverterRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
        return getStringHttpMessageConverterRestTemplate(restTemplate, stringHttpMessageConverter);
    }

    private RestTemplate getStringHttpMessageConverterRestTemplate(RestTemplate restTemplate, StringHttpMessageConverter stringHttpMessageConverter) {
        stringHttpMessageConverter.setWriteAcceptCharset(false);
        for (int i = 0; i < restTemplate.getMessageConverters().size(); i++) {
            if (restTemplate.getMessageConverters().get(i) instanceof StringHttpMessageConverter) {
                restTemplate.getMessageConverters().remove(i);
                restTemplate.getMessageConverters().add(i, stringHttpMessageConverter);
                break;
            }
        }
        return restTemplate;
    }
}
