package com.bitnationcode.topflies.model;

import com.bitnationcode.topflies.model.base.BaseModel;
import com.bitnationcode.topflies.model.base.IPersistent;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Fly")
public class Fly extends BaseModel implements IPersistent {

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
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @NotBlank
    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @NotBlank
    @Column(name = "imageUrl", nullable = false, length = 250)
    private String imageUrl;

    @NotBlank
    @Column(name = "videoUrl", nullable = false, length = 250)
    private String videoUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "flyTypeId", nullable = false)
    private FlyType flyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insectId", nullable = false)
    private Insect insect;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "fly_geographicarea",
            joinColumns = @JoinColumn(name = "fly_id"),
            inverseJoinColumns = @JoinColumn(name = "geographicarea_id")
    )
    @OrderColumn(name = "name")
    private Set<GeographicArea> geographicAreas = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "fly_river",
            joinColumns = @JoinColumn(name = "fly_id"),
            inverseJoinColumns = @JoinColumn(name = "river_id")
    )
    @OrderColumn(name = "name")
    private Set<River> rivers = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "fly_season",
            joinColumns = @JoinColumn(name = "fly_id"),
            inverseJoinColumns = @JoinColumn(name = "season_id")
    )
    @OrderColumn(name = "name")
    private Set<River> seasons = new HashSet<>();
}
