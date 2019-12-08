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
@Table(name = "HookSize")
public class HookSize extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hookSizeId", nullable = false)
    private long hookSizeId;

    @NotBlank
    @Column(name = "size")
    private int size;
}
