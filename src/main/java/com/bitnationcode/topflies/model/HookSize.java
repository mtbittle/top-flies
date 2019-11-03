package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Entity
@Table(name = "HookSize")
public class HookSize extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hookSizeId", nullable = false)
    private long hookSizeId;

    @NotBlank
    @Column(name = "size")
    private int size;

    public long getHookSizeId() {
        return hookSizeId;
    }

    public void setHookSizeId(long hookSizeId) {
        this.hookSizeId = hookSizeId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
