package com.portal.subscriptioncore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Subscription")
public class Subscription extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long houseId;

    @Column(nullable = false)
    private Long totalQuantity;

    @Column(nullable = false)
    private LocalDateTime dateAnnounce;

    @Column(nullable = false)
    private LocalDateTime dateApply;

    @Column(nullable = false)
    private LocalDateTime dateWinner;

}
