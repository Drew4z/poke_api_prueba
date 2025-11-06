package com.poke_api.pokemon.domain.extra;

import com.fasterxml.jackson.annotation.*;

public class Flavor {
    private Firmness flavor;
    private long potency;

    @JsonProperty("flavor")
    public Firmness getFlavor() { return flavor; }
    @JsonProperty("flavor")
    public void setFlavor(Firmness value) { this.flavor = value; }

    @JsonProperty("potency")
    public long getPotency() { return potency; }
    @JsonProperty("potency")
    public void setPotency(long value) { this.potency = value; }
}
