package com.webflux.reactiveApi.client;

import com.webflux.reactiveApi.model.CharacterResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RickAndMortyClient {
    private final WebClient webClient;


    public RickAndMortyClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://rickandmortyapi.com/api").build();
    }

    public Mono<CharacterResponse> findCharacterById(String id) {
        return webClient.get().uri("/character/"+id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CharacterResponse.class);
    }
}
