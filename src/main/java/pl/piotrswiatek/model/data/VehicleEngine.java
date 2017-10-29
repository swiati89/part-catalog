package pl.piotrswiatek.model.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "vehicle_engine")
public class VehicleEngine implements Serializable {
    private static final Long serialVersionUID = 456781233L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "engine_code")
    private String code;
    @Column(name = "capacity")
    private Integer capacity;
    @ManyToOne
    @JoinColumn(name = "engine_type_id")
    private EngineType engineType;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
}
