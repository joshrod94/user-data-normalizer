package com.joshrod94.userdatanormalizer.web;

import com.joshrod94.userdatanormalizer.dto.NormalizationRunResponse;
import com.joshrod94.userdatanormalizer.service.UserNormalizationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserNormalizationController {

    private final UserNormalizationService userNormalizationService;

    public UserNormalizationController(UserNormalizationService userNormalizationService) {
        this.userNormalizationService = userNormalizationService;
    }

    @PostMapping("/normalize")
    public NormalizationRunResponse normalizeUsers() {
        return userNormalizationService.normalizeUsers();
    }
}