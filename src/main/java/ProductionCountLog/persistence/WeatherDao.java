package ProductionCountLog.persistence;

import ProductionCountLog.entity.User;
import ProductionCountLog.entity.WeatherConfirm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class WeatherDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public List<WeatherConfirm> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeatherConfirm> query = builder.createQuery(WeatherConfirm.class);
        Root<WeatherConfirm> root = query.from(WeatherConfirm.class);
        List<WeatherConfirm> weather = session.createQuery(query).getResultList();
        session.close();
        return weather;
    }



    public WeatherConfirm getById(int id){
        Session session = sessionFactory.openSession();
        WeatherConfirm weather = session.get(WeatherConfirm.class, id);
        session.close();
        return weather;
    }


    public void saveOrUpdate(WeatherConfirm weather) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(weather);
        session.close();
    }


    public int insert(WeatherConfirm weather) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(weather);
        transaction.commit();
        logger.debug("user value to insert  " + weather);
        session.close();
        return id;
    }


    public void delete(WeatherConfirm weather) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(weather);
        transaction.commit();
        session.close();
    }



    public List<WeatherConfirm> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeatherConfirm> query = builder.createQuery( WeatherConfirm.class );
        Root<WeatherConfirm> root = query.from( WeatherConfirm.class );
        List<WeatherConfirm> weather = session.createQuery( query ).getResultList();

        logger.debug("The list of users " + weather);
        session.close();

        return weather;
    }


    public List<WeatherConfirm> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for weather with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeatherConfirm> query = builder.createQuery( WeatherConfirm.class );
        Root<WeatherConfirm> root = query.from( WeatherConfirm.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<WeatherConfirm> weather = session.createQuery( query ).getResultList();

        session.close();
        return weather;
    }


    public List<WeatherConfirm> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for weather with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeatherConfirm> query = builder.createQuery( WeatherConfirm.class );
        Root<WeatherConfirm> root = query.from( WeatherConfirm.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<WeatherConfirm> weather = session.createQuery( query ).getResultList();
        session.close();
        return weather;
    }


}
