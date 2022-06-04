package com.example.mysearchapi.infra;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.stream.Collectors;

@JsonDeserialize(as = NaverRestApiResponse.class)
public record NaverRestApiResponse(List<NaverRestApiResponseItem> items) implements ExternalApiResponse {

    @Override
    public List<ResponseItem> getApiResults() {
        return items.stream()
                .map(item -> ResponseItem.builder()
                        .type("naver")
                        .placeName(item.title())
                        .address(item.address())
                        .build())
                .collect(Collectors.toList());
    }
}
