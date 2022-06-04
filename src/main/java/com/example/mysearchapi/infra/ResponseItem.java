package com.example.mysearchapi.infra;

import lombok.Builder;

public record ResponseItem(String type, String placeName, String address) {

    @Builder
    public ResponseItem {
    }
}
