package com.portal.subscriptionapi;

import com.portal.subscriptioncore.SubscriptionCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SubscriptionCoreConfiguration.class)
@SpringBootApplication
public class SubscriptionApiApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-subscription-core,application-subscription-api");
        SpringApplication.run(SubscriptionApiApplication.class, args);
    }
}
