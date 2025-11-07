package com.poke_api.pokemon.infrastructure.adapter.in.controller;

import com.poke_api.pokemon.application.service.pokeApiService;
import com.poke_api.pokemon.domain.response.pokeApiResponse;
import com.poke_api.pokemon.infrastructure.dto.pokeApiRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class pokeApiController {
    private pokeApiService pokeApiService; // 1. Declaramos que el controller tendrá un campo de tipo pokeApiService (como una caja vacía esperando a ser rellenada)
                                            // 1.1. En pokeApiService al poner @Service el propio spring creará automaticmamente una instancia de la clase
                                            // 1.2. Lombok al poner AllArgsConstructor creará por nosotros el constructor y spring al ver que necestiamos una
                                                // instacia de tipo pokeApiService y, por lo tanto, spring inyecta el objeto creado anteriormente a la caja vacia del controller
    @GetMapping("/berries/{id}") // 2. Esperamos una HTTP GET Request, e indicamos el endpoint, y vemos que recogeremos una variable
    @ResponseStatus(HttpStatus.OK) // 3. Si todo fue bien, se enviara un response de tipo OK
    public pokeApiResponse searchByBerriesFirmness(@PathVariable Long id){ // 4. Aqui utilimazos un método de que retornaremos un objeto de tipo pokeApiResponse y con el Pathvariable sacaremos de la URL ese paramentro

        pokeApiResponse response = // 6. Luego al recibir la respuesta del servicio, que será un objeto de tipo pokeApiResponse con el id, name, y el tipo.
                pokeApiService.searchByBerriesFirmness(id); // 5. Envía el id al servicio y esperas a que termine el proceso del service
        return response; // 7. Por último enviaremos al cliente el objeto ya formateado a JSON gracias a Jackson una librería de spring
    }
}
