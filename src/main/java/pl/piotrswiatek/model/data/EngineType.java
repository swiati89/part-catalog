package pl.piotrswiatek.model.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
@Entity
@Table(name = "engine_type")
public class EngineType implements Serializable {
    private static final Long serialVersionUID = 456789123L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "fuel")
    private String fuel;
    @JsonBackReference
    @OneToMany(mappedBy = "engineType", fetch = FetchType.EAGER)
    private List<VehicleEngine> vehicleEngines;
}
