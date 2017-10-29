package pl.piotrswiatek.model.data.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Data
public class ManufacturerDto {
    private Long id;
    private String name;
    private String address;
    private String countryName;
    private String countryCode;
    private List<String> vehicleEngineCodes;
}
