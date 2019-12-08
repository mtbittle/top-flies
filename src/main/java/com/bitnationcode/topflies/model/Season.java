package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Data
@Entity
@Table(name = "Season")
public class Season extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seasonId", nullable = false)
    private long seasonId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToMany(mappedBy = "seasons")
    private Set<Fly> flies = new HashSet<>();
}
