package com.bitnationcode.topflies.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface IPersistent extends Serializable {

    Integer getVersion();
    void setVersion(Integer version);

    Date getCreatedDate();
    void setCreatedDate(Date updatedDate);

    String getCreatedBy();
    void setCreatedBy(String createdBy);

    Date getUpdatedDate();
    void setUpdatedDate(Date updatedDate);

    String getUpdatedBy();
    void setUpdatedBy(String updatedBy);
}
