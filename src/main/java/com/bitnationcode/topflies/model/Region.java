package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Region")
public class Region extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regionId", nullable = false)
    private long regionId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToMany(mappedBy = "regions")
    private Set<Fly> flies = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "riverId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<River> riverList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "insectId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<Insect> insectList;
}
