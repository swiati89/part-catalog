package pl.piotrswiatek.dao;

import pl.piotrswiatek.model.data.CarModel;
import pl.piotrswiatek.model.data.Part;

/**
 * Created by Piotrek on 2017-07-03.
 */
public interface PartDao extends GenericDao<Part, Long> {
    void changePrice(Part part, Double price);
    void addCarModel(Part part, CarModel carModel);

}
