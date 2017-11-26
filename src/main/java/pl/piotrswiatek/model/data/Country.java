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
@Table(name = "country")
public class Country implements Serializable {
    private static final Long serialVersionUID = 123456789L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "country_code")
    private String countryCode;
    @JsonBackReference
    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private List<Manufacturer> manufacturers;
}
