package com.joshrod94.userdatanormalizer.service;

import com.joshrod94.userdatanormalizer.client.SourceUserApiClient;
import org.springframework.stereotype.Service;

@Service
public class UserNormalizationService {

    private final SourceUserApiClient sourceUserApiClient;

    public UserNormalizationService(SourceUserApiClient sourceUserApiClient) {
        this.sourceUserApiClient = sourceUserApiClient;
    }

    public void normalizeUsers() {
        String rawJson = sourceUserApiClient.fetchUsers();
        // Next step: parse rawJson into DTOs
    }
}
