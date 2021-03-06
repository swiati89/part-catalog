package pl.piotrswiatek.dao.hibernate;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.piotrswiatek.dao.PartDao;
import pl.piotrswiatek.model.data.CarModel;
import pl.piotrswiatek.model.data.Part;

import java.util.List;
import java.util.Map;

@Transactional
@Repository
public class PartDaoHibernate implements PartDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void changePrice(Part part, Double price) {

    }

    @Override
    public void addCarModel(Part part, CarModel carModel) {

    }

    @Override
    public void addPart(Part part) {

    }

    @Override
    public List<Part> getAll() {
        return null;
    }

    @Override
    public List<Part> getAllDistinct() {
        return null;
    }

    @Override
    public List<Part> findAll(List<Criterion> criterions) {
        return null;
    }

    @Override
    public Part get(Long id) {
        Session sess = getSessionFactory().getCurrentSession();
        IdentifierLoadAccess byId = sess.byId(Part.class);
        Part entity = (Part) byId.load(id);

        return entity;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public Part save(Part object) {
        return null;
    }

    @Override
    public void remove(Part object) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Part> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
        return null;
    }

    @Override
    public void reindex() {

    }

    @Override
    public void reindexAll(boolean async) {

    }
}
