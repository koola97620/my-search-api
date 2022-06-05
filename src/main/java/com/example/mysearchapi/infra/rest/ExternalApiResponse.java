package com.example.mysearchapi.infra.rest;

import com.example.mysearchapi.infra.ResponseItem;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = ExternalApiResponseDeserializer.class)
public interface ExternalApiResponse {
    List<ResponseItem> getApiResults();
}
