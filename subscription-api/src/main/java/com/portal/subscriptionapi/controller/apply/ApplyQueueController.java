package com.portal.subscriptionapi.controller.apply;

import com.portal.subscriptionapi.dto.ApplyUserResponse;
import com.portal.subscriptioncore.service.apply.ApplyQueueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/application")
public class ApplyQueueController {

    private final ApplyQueueService applyQueueService;

    @PostMapping("")
    public Mono<ApplyUserResponse> apply(@RequestParam(name = "queue", defaultValue = "apply") String queue,
                                         @RequestParam(name = "userId") Long userId,
                                         @RequestParam(name = "supplyId") Long supplyId) {
        return applyQueueService.registerWaitQueue(queue, userId, supplyId)
                .map(ApplyUserResponse::new);
    }

}
