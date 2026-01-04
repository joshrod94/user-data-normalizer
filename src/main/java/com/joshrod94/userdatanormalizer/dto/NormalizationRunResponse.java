package com.joshrod94.userdatanormalizer.dto;

public class NormalizationRunResponse {
    private int fetchedCount;

    public NormalizationRunResponse(int fetchedCount) {
        this.fetchedCount = fetchedCount;
    }

    public int getFetchedCount() {
        return fetchedCount;
    }
}
