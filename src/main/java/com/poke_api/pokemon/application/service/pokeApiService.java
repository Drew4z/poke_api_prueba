package com.poke_api.pokemon.application.service;

import com.poke_api.pokemon.PokemonApplication;
import com.poke_api.pokemon.domain.response.pokeApiResponse;
import com.poke_api.pokemon.infrastructure.dto.pokeApiRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class pokeApiService {
    public String searchByBerriesFirmness(pokeApiRequest request){
        WebClient client = WebClient.builder()
                .baseUrl("https://pokeapi.co/api/v2/berry-firmness/"+ request.id())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build()
                ;
        pokeApiResponse response = client.get()
                .retrieve()
                .bodyToMono(pokeApiResponse.class)
                .block()
                ;
         return response.toString();
    }

}
