package pl.piotrswiatek.model.data;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Piotrek on 2017-06-30.
 */
@Data
@Entity
@Table(name ="part")
public class Part implements Serializable{
    private static final Long serialVersionUID = 456789456L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "part")
    private List<CarModel> carModels;
    @Column(name = "price")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "part_category_id")
    private PartCategory category;
    @OneToMany(mappedBy = "part")
    private List<PartPhoto> partPhotos;


}
