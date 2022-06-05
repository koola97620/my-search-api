package com.example.mysearchapi.app;

import com.example.mysearchapi.infra.ResponseItem;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

public record PlaceSearchResponse(List<ResponseItem> places) {

    @Builder
    public PlaceSearchResponse {}

    public List<String> placeNames() {
        return places.stream()
                .map(ResponseItem::placeName)
                .collect(Collectors.toList());
    }
}
