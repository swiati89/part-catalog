package pl.piotrswiatek.model.data.dto;

import lombok.Data;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
public class CarModelDto {
    private Long id;
    private String name;
    private Integer engineCapacity;
    private Integer doorCount;
    private String vin;
    private String productionYear;
    private String manufacturerName;
}
