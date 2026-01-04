package com.joshrod94.userdatanormalizer.service;

import com.joshrod94.userdatanormalizer.client.SourceUserApiClient;
import org.springframework.stereotype.Service;
import com.joshrod94.userdatanormalizer.dto.SourceUserDto;

@Service
public class UserNormalizationService {

    private final SourceUserApiClient sourceUserApiClient;

    public UserNormalizationService(SourceUserApiClient sourceUserApiClient) {
        this.sourceUserApiClient = sourceUserApiClient;
    }

    public int normalizeUsers() {
        SourceUserDto[] users = sourceUserApiClient.fetchUsers();
        return users.length;
        // Next step: transform SourceUserDto[] into NormalizedUser domain models
    }
}
