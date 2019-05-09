package com.dorosh.apiPet3.controllers;


import com.dorosh.apiPet3.models.PetDTO;
import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ControllersBaeldung {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://petstore.swagger.io/v2/pet/2";

    @Test
    void tt(){ //obtain response entity
        ResponseEntity <String> response  = restTemplate.getForEntity(url, String.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
        System.out.println(response.getBody());
    }
    @Test
    void tt2() { //obtain pojo
      PetDTO pet = restTemplate.getForObject(url, PetDTO.class);
      assertThat(pet.name, is("MirelaKukela"));
    }

    @Test
    void tt3() { //obtain header
        HttpHeaders httpHeaders = restTemplate.headForHeaders(url);
        Assert.isTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
    }




}
