package com.joshrod94.userdatanormalizer.transform;

import com.joshrod94.userdatanormalizer.domain.NormalizedUser;
import com.joshrod94.userdatanormalizer.dto.SourceUserDto;
import org.springframework.stereotype.Component;

@Component
public class UserNormalizer {

    public NormalizedUser normalize(SourceUserDto source) {
        NormalizedUser normalized = new NormalizedUser();

        if (source == null) {
            return normalized;
        }

        normalized.setExternalId(source.getId());
        normalized.setFullName(source.getName());
        normalized.setHandle(source.getUsername());

        // Normalize email: trim + lowercase
        normalized.setEmail(normalizeEmail(source.getEmail()));

        // Flatten nested address.city (null-safe)
        if (source.getAddress() != null) {
            normalized.setCity(source.getAddress().getCity());
        }

        // Flatten nested company.name (null-safe)
        if (source.getCompany() != null) {
            normalized.setCompanyName(source.getCompany().getName());
        }

        return normalized;
    }

    private String normalizeEmail(String email) {
        if (email == null) {
            return null;
        }
        return email.trim().toLowerCase();
    }
}
