package pl.piotrswiatek.model.data.dto;

import lombok.Data;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Data
public class VehicleEngineDto {
    private Long id;
    private String code;
    private Integer capacity;
    private String engineTypeName;
    private String fuelType;
    private String manufacturerName;
}
