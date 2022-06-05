package com.example.mysearchapi.app;

import com.example.mysearchapi.query.PlaceQueryService;
import org.springframework.stereotype.Service;

@Service
public class PlaceSearchService {

    private final PlaceQueryService placeQueryService;

    public PlaceSearchService(PlaceQueryService placeQueryService) {
        this.placeQueryService = placeQueryService;
    }

    public PlaceSearchResponse searchPlaces(String keyword) {
        return PlaceSearchResponse.builder()
                .places(placeQueryService.getPlace(keyword))
                .build();
    }

}
