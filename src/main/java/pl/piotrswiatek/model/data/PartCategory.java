package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Piotrek on 2017-06-30.
 */
@Data
@Entity
@Table(name = "part_category")
public class PartCategory implements Serializable {
    private static final Long serialVersionUID = 456123123L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @JsonBackReference
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Part> parts;

}
