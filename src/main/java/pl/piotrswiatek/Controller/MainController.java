package pl.piotrswiatek.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piotrswiatek.model.data.CarModel;
import pl.piotrswiatek.model.data.Part;
import pl.piotrswiatek.service.CarModelService;
import pl.piotrswiatek.service.PartService;

@RestController
public class MainController {

    @Autowired
    private CarModelService carModelService;

    @Autowired
    private PartService partService;

    @RequestMapping(value = "/carmodelById", method = RequestMethod.GET)
    public CarModel getCarModel() {
        return carModelService.getCarModelById(-1L);
    }

    @RequestMapping(value = "/partById", method = RequestMethod.GET)
    public Part getPart() {
        return partService.getPartById(-1L);
    }
}
