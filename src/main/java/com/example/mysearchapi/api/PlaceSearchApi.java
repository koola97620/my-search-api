package com.example.mysearchapi.api;

import com.example.mysearchapi.app.PlaceSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceSearchApi {

    private final PlaceSearchService placeSearchService;

    public PlaceSearchApi(PlaceSearchService placeSearchService) {
        this.placeSearchService = placeSearchService;
    }

    @GetMapping("/extsvc/my-search-api/v1/client/places")
    public ResponseEntity getPlaces(String keyword) {
        return ResponseEntity.ok(placeSearchService.searchPlaces(keyword));
    }
}
