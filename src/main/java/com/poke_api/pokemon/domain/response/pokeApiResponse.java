package com.poke_api.pokemon.domain.response;

import com.fasterxml.jackson.annotation.*;
import com.poke_api.pokemon.domain.extra.Firmness;
import com.poke_api.pokemon.domain.extra.Flavor;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // 1. Al recibir un JSON con muchos campos, con esto le decimos a spring que
// aunque haya más campos que los que tengo en esta clase, que los ignore, y solo los rellene con los que hay aquí.
public class pokeApiResponse {
    private long id; // 2. Atributos
    private String name; // 2. otro atributo

    @JsonProperty("natural_gift_power")// 3. Sirve para decir que del campo del JSON que nos devuelve la API, ese campo
    // la info del campo la rellenemos a la propiedad siguiente.
    private long naturalGiftPower;
}
