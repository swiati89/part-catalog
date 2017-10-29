package pl.piotrswiatek.model.data.dto;

import lombok.Data;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Data
public class PartPhotoDto {
    private Long id;
    private String name;
    private String description;
    private String partName;
    private String path;

}
