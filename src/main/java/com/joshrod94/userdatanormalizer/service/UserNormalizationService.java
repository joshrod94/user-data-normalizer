package com.joshrod94.userdatanormalizer.service;

import com.joshrod94.userdatanormalizer.client.SourceUserApiClient;
import com.joshrod94.userdatanormalizer.domain.NormalizedUser;
import com.joshrod94.userdatanormalizer.dto.SourceUserDto;
import com.joshrod94.userdatanormalizer.transform.UserNormalizer;
import org.springframework.stereotype.Service;
import com.joshrod94.userdatanormalizer.dto.NormalizationRunResponse;


@Service
public class UserNormalizationService {

    private final SourceUserApiClient sourceUserApiClient;
    private final UserNormalizer userNormalizer;

    public UserNormalizationService(SourceUserApiClient sourceUserApiClient, UserNormalizer userNormalizer) {
        this.sourceUserApiClient = sourceUserApiClient;
        this.userNormalizer = userNormalizer;
    }

    public NormalizationRunResponse normalizeUsers() {
        SourceUserDto[] users = sourceUserApiClient.fetchUsers();
        int fetchedCount = (users == null) ? 0 : users.length;

        NormalizedUser sample = null;
        if (users != null && users.length > 0) {
            sample = userNormalizer.normalize(users[0]);
        }

        return new NormalizationRunResponse(fetchedCount, sample);
    }
}

