package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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
    @JoinColumn(name = "geographicAreaId", nullable = false)
    private GeographicArea geographicArea;

    public long getInsectId() {
        return insectId;
    }

    public void setInsectId(long insectId) {
        this.insectId = insectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public GeographicArea getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(GeographicArea geographicArea) {
        this.geographicArea = geographicArea;
    }
}
