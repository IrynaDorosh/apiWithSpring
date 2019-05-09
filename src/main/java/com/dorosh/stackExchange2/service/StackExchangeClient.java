package com.dorosh.stackExchange2.service;

import com.dorosh.stackExchange2.models.SiteDTO;
import com.dorosh.stackExchange2.models.SitesDTO;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class StackExchangeClient {


    HttpClient httpClient = HttpClientBuilder.create().build();
    ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //Add the Jackson Message converter
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        // Note: here we are making this converter to process any kind of response,
        // not only application/*json, which is the default behaviour
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
    }


    public List<SiteDTO> getSites() throws URISyntaxException {

//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//        //Add the Jackson Message converter
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        // Note: here we are making this converter to process any kind of response,
//        // not only application/*json, which is the default behaviour
//        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//        messageConverters.add(converter);
//        restTemplate.setMessageConverters(messageConverters);

        String url = "https://api.stackexchange.com//2.2/sites?page=1&pagesize=5&filter=!YOHUhxwpMHVa_nHDT3YCom4DwO";
        SitesDTO responce = restTemplate.getForObject(new URI(url), SitesDTO.class);
        return responce.getItems();
    }

    @Test
    public void test() throws URISyntaxException {
        List<SiteDTO> list = getSites();
        System.out.println("Size is: " + list.size());
    }
}
