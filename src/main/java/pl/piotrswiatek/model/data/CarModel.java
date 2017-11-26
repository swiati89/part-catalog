package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "car_model")
public class CarModel implements Serializable {
    private static final Long serialVersionUID = 789456123L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "engine_capacity")
    private Integer engineCapacity;
    @Column(name = "door_count")
    private Integer doorCount;
    @Column(name = "VIN")
    private String vin;
    @Column(name = "production_year")
    private Date productionYear;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "vehicle_body_type_id")
    private VehicleBodyType vehicleBodyType;
    @ManyToOne
    @JoinColumn(name = "vehicle_engine_id")
    private VehicleEngine vehicleEngine;
    @JsonManagedReference
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "car_model_part",
            joinColumns = {@JoinColumn(name = "car_model_id")},
            inverseJoinColumns = {@JoinColumn(name = "part_id")}
    )
    private List<Part> parts;


}
