package com.bitnationcode.topflies.model.base;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseModel implements IPersistent {

    @Version
    @Column(name = "version")
    protected Integer version;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdDate", nullable = false, length = 23)
    protected Date createdDate;

    @CreatedBy
    @Column(name = "createdBy", nullable = false, length = 50)
    protected String createdBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedDate", nullable = true, length = 23)
    protected Date updatedDate;

    @LastModifiedBy
    @Column(name = "updatedBy", nullable = true, length = 50)
    protected String updatedBy;

    public BaseModel() { }

    public BaseModel(Integer version, Date createdDate, String createdBy) {
        this.version = version;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public BaseModel(Integer version, Date createdDate, String createdBy, Date updatedDate, String updatedBy) {
        this.version = version;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }

    @Override
    public Integer getVersion() {
        return version;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm")
    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm")
    public Date getUpdatedDate() {
        return updatedDate;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "version=" + version +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", updatedDate=" + updatedDate +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
