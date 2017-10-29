package pl.piotrswiatek.model.data.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
public class EngineTypeDto {
    private Long id;
    private String typeName;
    private String fuel;
    private List<String> vehicleEngineCodes;
}
