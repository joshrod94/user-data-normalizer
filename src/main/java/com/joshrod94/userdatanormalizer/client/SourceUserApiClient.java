package com.joshrod94.userdatanormalizer.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import com.joshrod94.userdatanormalizer.dto.SourceUserDto;


@Component
public class SourceUserApiClient {

    private final RestClient restClient;

    public SourceUserApiClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public SourceUserDto[] fetchUsers() {
        return restClient
                .get()
                .uri("https://jsonplaceholder.typicode.com/users")
                .retrieve()
                .body(SourceUserDto[].class);
    }
}
