package com.poke_api.pokemon.infrastructure.dto;

public record pokeApiRequest(
    long id,
    String name,
    long naturalGiftPower
) {
}
