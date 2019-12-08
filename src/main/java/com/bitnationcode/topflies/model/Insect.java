package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "Insect")
public class Insect extends BaseModel implements IPersistent {

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "regionId", nullable = false)
    private Region region;

}
