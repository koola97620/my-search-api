package com.example.mysearchapi.infra;

import java.util.Locale;

public record NaverRestApiResponseItem (
        String title, String telephone, String address, String roadAddress, String description) {
}
