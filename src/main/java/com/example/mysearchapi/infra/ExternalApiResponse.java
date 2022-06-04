package com.example.mysearchapi.infra;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = ApiResponseDeserializer.class)
public interface ExternalApiResponse {
    List<ResponseItem> getApiResults();
}
