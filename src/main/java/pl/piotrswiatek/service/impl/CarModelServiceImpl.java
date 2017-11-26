package pl.piotrswiatek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrswiatek.dao.CarModelDao;
import pl.piotrswiatek.model.data.CarModel;
import pl.piotrswiatek.service.CarModelService;

@Service
public class CarModelServiceImpl implements CarModelService{

    private CarModelDao carModelDao;

    @Autowired
    public CarModelServiceImpl(CarModelDao carModelDao){
        this.carModelDao = carModelDao;
    }

    @Override
    public CarModel getCarModelById(Long id) {
        return carModelDao.get(id);
    }
}
