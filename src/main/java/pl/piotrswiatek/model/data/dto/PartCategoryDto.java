package pl.piotrswiatek.model.data.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Data
public class PartCategoryDto {
    private Long id;
    private String categoryName;
    private List<String> partNames;
}
