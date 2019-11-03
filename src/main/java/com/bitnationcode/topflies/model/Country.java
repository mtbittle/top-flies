package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Data
@Entity
@Table(name = "State")
public class Country extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "countryId", nullable = false)
    private long stateId;

    @NotBlank
    @Column(name = "abbreviation", nullable = false, length = 3)
    private String abbreviation;

    @NotBlank
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "stateId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<State> stateList;
}
