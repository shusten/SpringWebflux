package com.webflux.reactiveApi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ListOfEpisodesResponse (
        List<EpisodeResponse> results
){ }