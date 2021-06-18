package com.mocyx.springdatah2caffeineexample;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.google.common.collect.Lists;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;


@Configuration
public class config {
    @Bean(name = "cacheManager")
    public CacheManager cacheManager() {
        Caffeine < Object, Object > caffeineBuilder=Caffeine.newBuilder()
                .initialCapacity(100)
                .maximumSize(500)
                .expireAfterAccess(10, TimeUnit.MINUTES)
                .recordStats();
        CaffeineCache caffeineCache=new CaffeineCache("caffeineCache",caffeineBuilder.build());
        SimpleCacheManager simpleCacheManager=new SimpleCacheManager();
        simpleCacheManager.setCaches(Lists.newArrayList(caffeineCache));
        return simpleCacheManager;
    }
}
