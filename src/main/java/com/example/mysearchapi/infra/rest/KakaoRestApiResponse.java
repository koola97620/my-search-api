package com.example.mysearchapi.infra.rest;

import com.example.mysearchapi.infra.ResponseItem;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.stream.Collectors;


@JsonDeserialize(as = KakaoRestApiResponse.class)
public record KakaoRestApiResponse(List<KakaoRestApiResponseItem> documents) implements ExternalApiResponse {

    @Override
    public List<ResponseItem> getApiResults() {
        return documents.stream()
                .map(document -> ResponseItem.builder()
                        .type("kakao")
                        .placeName(document.placeName())
                        .address(document.addressName())
                        .build())
                .collect(Collectors.toList());
    }
}
