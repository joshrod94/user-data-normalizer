package com.joshrod94.userdatanormalizer.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class SinkUserApiClient {

    private final RestClient restClient;

    public SinkUserApiClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public int forwardNormalizedUsers(Object payload) {
        return restClient
                .post()
                .uri("https://httpbin.org/post")
                .body(payload)
                .retrieve()
                .toBodilessEntity()
                .getStatusCode()
                .value();
    }
}
