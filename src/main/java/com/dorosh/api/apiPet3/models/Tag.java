package com.dorosh.api.apiPet3.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
public class Tag implements Serializable {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    private final static long serialVersionUID = 3695339202430805458L;

    public Tag() {
    }
}