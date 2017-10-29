package pl.piotrswiatek.model.data.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Data
public class VehicleBodyTypeDto {
    private Long id;
    private String name;
    private List<String> carModelNames;
}
