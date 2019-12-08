package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael
 * @date 11/3/2019
 **/
@Data
@Entity
@Table(name = "River")
public class River extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "riverId", nullable = false)
    private long riverId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToMany(mappedBy = "rivers")
    private Set<Fly> flies = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "regionId", nullable = false)
    private Region region;

}
