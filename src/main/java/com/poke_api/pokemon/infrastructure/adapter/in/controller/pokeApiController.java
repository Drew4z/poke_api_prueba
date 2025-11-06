package com.poke_api.pokemon.infrastructure.adapter.in.controller;

import com.poke_api.pokemon.application.service.pokeApiService;
import com.poke_api.pokemon.infrastructure.dto.pokeApiRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class pokeApiController {
    private pokeApiService pokeApiService;

    @GetMapping("/berries")
    @ResponseStatus(HttpStatus.OK)
    public String searchByBerriesFirmness(@RequestBody pokeApiRequest request){
        return pokeApiService.searchByBerriesFirmness(request);
    }
}
