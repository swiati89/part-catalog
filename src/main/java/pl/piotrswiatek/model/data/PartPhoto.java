package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Piotrek on 2017-06-30.
 */
@Data
@Entity
@Table(name = "part_photo")
public class PartPhoto implements Serializable {
    private static final Long serialVersionUID = 159789123L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "part_id")
    private Part part;
    @Column(name = "photo_path")
    private String path;
}
