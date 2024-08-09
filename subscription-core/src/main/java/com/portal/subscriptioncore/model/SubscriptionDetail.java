package com.portal.subscriptioncore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Subscription_Detail")
public class SubscriptionDetail extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long subscriptionId;

    @Column(nullable = false)
    private Long supplyQuantity;

    @Column(nullable = false)
    private String supplyArea;

    @Column(nullable = false)
    private Long supplyAmount;
}
