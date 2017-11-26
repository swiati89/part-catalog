package pl.piotrswiatek.dao.hibernate;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.piotrswiatek.dao.CarModelDao;
import pl.piotrswiatek.dao.GenericDao;
import pl.piotrswiatek.model.data.CarModel;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Transactional
@Repository
public class CarModelDaoHibernate  implements CarModelDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public List<CarModel> getAll() {
        return null;
    }

    @Override
    public List<CarModel> getAllDistinct() {
        return null;
    }

    @Override
    public List<CarModel> findAll(List<Criterion> criterions) {
        return null;
    }

    @Override
    public CarModel get(Long id) {
        Session sess = getSessionFactory().getCurrentSession();
        IdentifierLoadAccess byId = sess.byId(CarModel.class);
        CarModel entity = (CarModel) byId.load(id);

//        if (entity == null) {
//            log.warn("Uh oh, '" + this.persistentClass + "' object with id '"
//                    + id + "' not found...");
//
//            //maly upgrade
//            throw new NoSuchElementException(this.persistentClass.toString());
//        }

        return entity;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public CarModel save(CarModel object) {
        return null;
    }

    @Override
    public void remove(CarModel object) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<CarModel> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
        return null;
    }

    @Override
    public void reindex() {

    }

    @Override
    public void reindexAll(boolean async) {

    }
}
