package com.portal.subscriptioncore.service.apply;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplyQueueService {

    private final ReactiveRedisTemplate<String, String> redisTemplate;
    private final String APPLY_QUEUE_WAIT_KEY = "apply:queue:%d:wait"; // supplyId


}
