package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.constants.FlyType;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "Fly")
@EntityListeners(AuditingEntityListener.class)
public class Fly {

    /*
    Additional information at some point:
    1. season to fish
    2. best types of fish
    3. dry/wet fly
    4. how to fish
    5. how to tie
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flyId", nullable = false)
    private long flyId;

    @NotBlank
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "flyType", nullable = false, length = 50)
    private int flyType = 1;

    @NotBlank
    @Column(name = "insectStage", nullable = false, length = 50)
    private String insectStage;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "fly", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Insect insect;

    @NotBlank
    @Column(name = "imageUrl", nullable = false, length = 250)
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedDate;

    public long getFlyId() {
        return flyId;
    }

    public void setFlyId(long flyId) {
        this.flyId = flyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlyType getFlyType() {
        FlyType flyType = FlyType.DRY;
        try {
            flyType = FlyType.getFlyTypeFromInt(this.flyType);
        } catch (IllegalArgumentException e) {
            //defaulting to dry fly
        }
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        if (null == flyType) {
            this.flyType = FlyType.WET.getId();
        }
        this.flyType = flyType.getId();
    }

    public String getInsectStage() {
        return insectStage;
    }

    public void setInsectStage(String insectStage) {
        this.insectStage = insectStage;
    }

    public Insect getInsect() {
        return insect;
    }

    public void setInsect(Insect insect) {
        this.insect = insect;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
