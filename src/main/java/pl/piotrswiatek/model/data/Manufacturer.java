package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "manufacturer")
public class Manufacturer implements Serializable {
    private static final Long serialVersionUID = 78989123L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @JsonBackReference
    @OneToMany(mappedBy = "manufacturer")
    private List<VehicleEngine> vehicleEngines;
}
