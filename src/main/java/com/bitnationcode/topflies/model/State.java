package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Data
@Entity
@Table(name = "State")
public class State extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stateId", nullable = false)
    private long stateId;

    @NotBlank
    @Column(name = "abbreviation", nullable = false, length = 2)
    private String abbreviation;

    @NotBlank
    @Column(name = "name", nullable = false, length = 100)
    private String name;
}
