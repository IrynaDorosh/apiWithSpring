package com.dorosh.api.stackExchange2.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "aliases",
        "favicon_url",
        "audience",
        "site_url",
        "name"
})
@Data
public class SiteDTO implements Serializable
{
    @JsonProperty("aliases")
    public List<String> aliases = null;

    @JsonProperty("favicon_url")
    private String faviconUrl;

    @JsonProperty("audience")
    private String audience;

    @JsonProperty("site_url")
    private String siteUrl;
    @JsonProperty("name")
    private String name;

    public SiteDTO() {
    }

    public SiteDTO(List <String> aliases, String faviconUrl, String audience, String siteUrl, String name) {
        super();
        this.aliases = aliases;
        this.faviconUrl = faviconUrl;
        this.audience = audience;
        this.siteUrl = siteUrl;
        this.name = name;
    }


}
