package com.webflux.reactiveApi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record CharacterResponse(
        String id,
        String name,
        String status,
        String species,
        String image,
        List<String> episode
) {

}
