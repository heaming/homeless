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
@Table(name = "Application")
public class Application extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long subscriptionId;

    @Column(nullable = false)
    private Long subscriptionDetailId;

    @Column(nullable = false)
    private LocalDateTime dateApply;

    @Column
    private LocalDateTime dateCanceled;
}
