package com.example.mysearchapi.query;

import com.example.mysearchapi.infra.ResponseItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class PlaceQueryService {

    private final Set<ExternalSearchService> externalSearchServiceList;

    public PlaceQueryService(Set<ExternalSearchService> externalSearchServiceList) {
        this.externalSearchServiceList = externalSearchServiceList;
    }

    public List<ResponseItem> getPlace(String keyword) {
        List<ResponseItem> responses = new ArrayList<>();
        for (ExternalSearchService service : externalSearchServiceList) {
            responses.addAll(service.get(keyword).getApiResults());
        }
        return responses;
    }
}
