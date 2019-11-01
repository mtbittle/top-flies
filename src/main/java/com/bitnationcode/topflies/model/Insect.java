package com.bitnationcode.topflies.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "User")
@EntityListeners(AuditingEntityListener.class)
public class Insect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insectId", nullable = false)
    private long insectId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @OneToOne(fetch = FetchType.EAGER, optional = false, targetEntity = Fly.class)
    @JoinColumn(name = "flyId")
    private Fly fly;
}
