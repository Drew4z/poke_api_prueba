package com.poke_api.pokemon.domain.extra;

import com.fasterxml.jackson.annotation.*;

public class Firmness {
    private String name;
    private String url;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}