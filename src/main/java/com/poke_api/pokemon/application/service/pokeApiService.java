package com.poke_api.pokemon.application.service;

import com.poke_api.pokemon.PokemonApplication;
import com.poke_api.pokemon.domain.response.pokeApiResponse;
import com.poke_api.pokemon.infrastructure.dto.pokeApiRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service // 1. Connotamos esta clase con service para indicar a Spring que es un service y de esta forma cree una instacia de la clase
public class pokeApiService {
    public pokeApiResponse searchByBerriesFirmness(long id){ // 2. Crea un método que devolverá un objeto de tipo pokeApiResponse y que tendremos que pasarle como parámetro el lond id
        WebClient client = WebClient.builder() // 3. Indicamos que habra una instancia pero que no se usará aún, ahora con builder indicamos que tenemos la intención de crear un objeto
                .baseUrl("https://pokeapi.co/api/v2/berry-firmness/"+ id) // 4. Le pasamos la URL con el id que optemos por medio del @PathVariable
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) // Le dices a la API que en caso de que le envies datos se lo enviarás en un foramto JSON
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)// 4.1. Le dices a la API que te reponda con un formato JSON
                .build() // 4.2. Sirve para crear por fin la instancia del WebClient
                ;
        pokeApiResponse response = client.get() // 5. Creamos un objeto vacio (que será rellenado cuando el block() termine) de tipo pokeApiResponse y luego señalamos que la petición que recibiremos será de tipo GET
                .retrieve() // 6. Inicia la petición a la API, aunque nuestra App podría estar haciendo otras cosas hasta que espere el response
                .bodyToMono(pokeApiResponse.class) // 7. Definimos el plan de ejecución, es decir, CUANDO la API responda, toma el 'body' (cuerpo)
                            // y conviértelo ('To') en una promesa de un solo objeto ('Mono')
                            // del tipo 'pokeApiResponse.class'
                .block();   // 8. ESTA es la línea que espera. Le dice al 'Mono' (la promesa):
        // "Ejecuta lo acordado, vuelve el flujo síncrono es decir, tenemos que esperar a que finalice la tarea para hacer otras,
        // Por lo que el block() espera y detiene todo hasta que tenga el response, cuando termina rellena el objeto response
        return response; // 9. Enviar al controlador la response ya formateada y llena.
    }

}
