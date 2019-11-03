package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "GeographicArea")
public class GeographicArea extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "geographicAreaId", nullable = false)
    private long geographicAreaId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToMany(mappedBy = "geographicAreas")
    private Set<Fly> flies = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "riverId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<River> riverList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "insectId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<Insect> insectList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seasonId", cascade = { CascadeType.ALL}, orphanRemoval = true)
    private List<Season> seasonList;

    public long getGeographicAreaId() {
        return geographicAreaId;
    }

    public void setGeographicAreaId(long geographicAreaId) {
        this.geographicAreaId = geographicAreaId;
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

    public List<River> getRiverList() {
        return riverList;
    }

    public void setRiverList(List<River> riverList) {
        this.riverList = riverList;
    }

    public List<Insect> getInsectList() {
        return insectList;
    }

    public void setInsectList(List<Insect> insectList) {
        this.insectList = insectList;
    }

    public List<Season> getSeasonList() {
        return seasonList;
    }

    public void setSeasonList(List<Season> seasonList) {
        this.seasonList = seasonList;
    }
}
