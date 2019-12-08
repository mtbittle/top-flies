package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "User")
public class User extends BaseModel implements IPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String emailAddress;

    @NotBlank
    private String encryptedPassword;
}
