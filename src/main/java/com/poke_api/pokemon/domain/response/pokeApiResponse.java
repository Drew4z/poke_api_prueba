package com.poke_api.pokemon.domain.response;

import com.fasterxml.jackson.annotation.*;
import com.poke_api.pokemon.domain.extra.Firmness;
import com.poke_api.pokemon.domain.extra.Flavor;

public class pokeApiResponse {
    private Firmness firmness;
    private Flavor[] flavors;
    private long growthTime;
    private long id;
    private Firmness item;
    private long maxHarvest;
    private String name;
    private long naturalGiftPower;
    private Firmness naturalGiftType;
    private long size;
    private long smoothness;
    private long soilDryness;

    @JsonProperty("firmness")
    public Firmness getFirmness() { return firmness; }
    @JsonProperty("firmness")
    public void setFirmness(Firmness value) { this.firmness = value; }

    @JsonProperty("flavors")
    public Flavor[] getFlavors() { return flavors; }
    @JsonProperty("flavors")
    public void setFlavors(Flavor[] value) { this.flavors = value; }

    @JsonProperty("growth_time")
    public long getGrowthTime() { return growthTime; }
    @JsonProperty("growth_time")
    public void setGrowthTime(long value) { this.growthTime = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("item")
    public Firmness getItem() { return item; }
    @JsonProperty("item")
    public void setItem(Firmness value) { this.item = value; }

    @JsonProperty("max_harvest")
    public long getMaxHarvest() { return maxHarvest; }
    @JsonProperty("max_harvest")
    public void setMaxHarvest(long value) { this.maxHarvest = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("natural_gift_power")
    public long getNaturalGiftPower() { return naturalGiftPower; }
    @JsonProperty("natural_gift_power")
    public void setNaturalGiftPower(long value) { this.naturalGiftPower = value; }

    @JsonProperty("natural_gift_type")
    public Firmness getNaturalGiftType() { return naturalGiftType; }
    @JsonProperty("natural_gift_type")
    public void setNaturalGiftType(Firmness value) { this.naturalGiftType = value; }

    @JsonProperty("size")
    public long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(long value) { this.size = value; }

    @JsonProperty("smoothness")
    public long getSmoothness() { return smoothness; }
    @JsonProperty("smoothness")
    public void setSmoothness(long value) { this.smoothness = value; }

    @JsonProperty("soil_dryness")
    public long getSoilDryness() { return soilDryness; }
    @JsonProperty("soil_dryness")
    public void setSoilDryness(long value) { this.soilDryness = value; }
}
