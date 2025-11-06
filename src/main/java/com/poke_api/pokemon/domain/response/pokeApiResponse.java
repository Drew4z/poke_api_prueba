package com.poke_api.pokemon.domain.response;

import com.fasterxml.jackson.annotation.*;
import com.poke_api.pokemon.domain.extra.Firmness;
import com.poke_api.pokemon.domain.extra.Flavor;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class pokeApiResponse {
    private long id;
    private String name;
    private long naturalGiftPower;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("natural_gift_power")
    public long getNaturalGiftPower() { return naturalGiftPower; }
    @JsonProperty("natural_gift_power")
    public void setNaturalGiftPower(long value) { this.naturalGiftPower = value; }

}
