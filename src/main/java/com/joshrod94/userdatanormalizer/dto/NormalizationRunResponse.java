package com.joshrod94.userdatanormalizer.dto;

import com.joshrod94.userdatanormalizer.domain.NormalizedUser;

public class NormalizationRunResponse {

    private int fetchedCount;
    private NormalizedUser sampleUser;
    private Integer forwardStatus;

    public NormalizationRunResponse(int fetchedCount,
                                    NormalizedUser sampleUser,
                                    Integer forwardStatus) {
        this.fetchedCount = fetchedCount;
        this.sampleUser = sampleUser;
        this.forwardStatus = forwardStatus;
    }

    public int getFetchedCount() {
        return fetchedCount;
    }

    public NormalizedUser getSampleUser() {
        return sampleUser;
    }

    public Integer getForwardStatus() {
        return forwardStatus;
    }
}

