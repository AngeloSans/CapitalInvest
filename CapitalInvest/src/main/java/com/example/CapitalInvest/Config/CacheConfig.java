package com.example.CapitalInvest.Config;


import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager cacheManager(){
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        final Caffeine<Object, Object> caffeineBuilder = Caffeine.newBuilder()
                        .expireAfterWrite(30, TimeUnit.DAYS);
        cacheManager.setCaffeine(caffeineBuilder);
        return cacheManager;
    }

}
