package com.demo.apps.cache.controller;

import com.demo.apps.cache.dto.CacheNames;
import com.demo.apps.cache.service.ICacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("!prod")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cache")
public class CacheController {

    private final ICacheService cacheService;

    @DeleteMapping("/names/evict")
    public Boolean evictCountryNamesCache() {
        cacheService.evictCacheValues(CacheNames.COUNTRY_NAMES);
        return true;
    }
}
