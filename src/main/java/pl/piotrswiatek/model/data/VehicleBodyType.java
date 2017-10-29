package pl.piotrswiatek.model.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "body_type")
public class VehicleBodyType implements Serializable {
    private static final Long serialVersionUID = 456778923L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "vehicleBodyType")
    private List<CarModel> carModels;
}
