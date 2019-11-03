package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael
 * @date 11/3/2019
 **/
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
    @JoinColumn(name = "geographicAreaId", nullable = false)
    private GeographicArea geographicArea;

    public long getRiverId() {
        return riverId;
    }

    public void setRiverId(long riverId) {
        this.riverId = riverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Fly> getFlies() {
        return flies;
    }

    public void setFlies(Set<Fly> flies) {
        this.flies = flies;
    }

    public GeographicArea getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(GeographicArea geographicArea) {
        this.geographicArea = geographicArea;
    }
}
