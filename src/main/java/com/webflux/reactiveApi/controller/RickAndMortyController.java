package com.webflux.reactiveApi.controller;

import com.webflux.reactiveApi.client.RickAndMortyClient;
import com.webflux.reactiveApi.model.CharacterResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/webclient")
@AllArgsConstructor
public class RickAndMortyController {

    RickAndMortyClient rickAndMortyClient;

    @GetMapping("/character/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CharacterResponse> getCharacterById(@PathVariable String id){
        return rickAndMortyClient.findCharacterById(id);
    }
}
