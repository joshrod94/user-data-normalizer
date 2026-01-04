package com.joshrod94.userdatanormalizer.dto;

import com.joshrod94.userdatanormalizer.domain.NormalizedUser;

public class NormalizationRunResponse {

    private int fetchedCount;
    private NormalizedUser sampleUser;

    public NormalizationRunResponse(int fetchedCount, NormalizedUser sampleUser) {
        this.fetchedCount = fetchedCount;
        this.sampleUser = sampleUser;
    }

    public int getFetchedCount() {
        return fetchedCount;
    }

    public NormalizedUser getSampleUser() {
        return sampleUser;
    }
}
