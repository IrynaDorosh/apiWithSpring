package com.dorosh.apiPet3.controllers;

import com.dorosh.apiPet3.models.Category;
import com.dorosh.apiPet3.models.PetDTO;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class PetShopClient {

    HttpClient httpClient = HttpClientBuilder.create().build();
    ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public String getPetnameByPetID(int id){
        String url = "https://petstore.swagger.io/v2/pet/" + id;
        PetDTO petDTO = restTemplate.getForObject(url, PetDTO.class);
        return petDTO.getName();
    }

    public PetDTO putPet(int idPet, String name) {
        String url = "https://petstore.swagger.io/v2/pet";
        Category category = new Category(2, "Abracadabra");
        List<String> list = new ArrayList<String>();
        list.add("rlll");
        PetDTO pet = new PetDTO(idPet, category, name, list, null, "sold");

        return restTemplate.postForObject(url, pet, PetDTO.class);
    }

    @Test
    public void test2(){
        putPet(2, "MirelaKukela");
        System.out.println(getPetnameByPetID(2));
    }


}
