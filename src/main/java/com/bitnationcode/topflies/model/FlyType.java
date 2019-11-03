package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Data
@Entity
@Table(name = "FlyType")
public class FlyType extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flyTypeId", nullable = false)
    private long flyTypeId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "flyType", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<Fly> flyList;
}
