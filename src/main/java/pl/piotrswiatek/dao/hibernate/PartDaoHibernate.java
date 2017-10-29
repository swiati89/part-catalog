package pl.piotrswiatek.dao.hibernate;

import org.dbunit.util.search.SearchException;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Repository;
import pl.piotrswiatek.dao.GenericDao;
import pl.piotrswiatek.dao.PartDao;
import pl.piotrswiatek.model.data.CarModel;
import pl.piotrswiatek.model.data.Part;

import java.util.List;
import java.util.Map;

/**
 * Created by Piotrek on 2017-07-03.
 */
@Repository("partDao")
public class PartDaoHibernate extends GenericDaoHibernate<Part, Long> implements PartDao {

    public PartDaoHibernate(){super(Part.class);}

    @Override
    public void changePrice(Part part, Double price) {

    }

    @Override
    public void addCarModel(Part part, CarModel carModel) {

    }

}
