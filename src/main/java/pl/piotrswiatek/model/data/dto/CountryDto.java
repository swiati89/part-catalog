package pl.piotrswiatek.model.data.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Piotrek on 2017-07-01.
 */
@Data
public class CountryDto {
    private Long id;
    private String name;
    private String countryCode;
    private List<String> manufacturersNames;
}
