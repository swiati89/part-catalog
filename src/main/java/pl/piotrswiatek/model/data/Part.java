package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

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
    @JsonBackReference
    @ManyToMany(mappedBy = "parts", fetch = FetchType.EAGER )
    private List<CarModel> carModels;
    @Column(name = "price")
    private Double price;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "part_category_id")
    private PartCategory category;
    @JsonBackReference
    @OneToMany(mappedBy = "part")
    private List<PartPhoto> partPhotos;


}
