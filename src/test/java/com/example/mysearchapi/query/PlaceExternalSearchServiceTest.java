package com.example.mysearchapi.query;

import com.example.mysearchapi.infra.ResponseItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(properties = "spring.profiles.active:test")
class PlaceExternalSearchServiceTest {

    @Autowired
    private PlaceQueryService placeQueryService;

    @Test
    void test() {
        List<ResponseItem> places = placeQueryService.getPlace("인덕원 곱창");
        System.out.println(places);
        assertThat(places.isEmpty()).isFalse();
    }

}
