package com.dorosh.api.apiPet3.models;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})

@Data
public class Category implements Serializable
{

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    private final static long serialVersionUID = -7879455872151275844L;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }
}
