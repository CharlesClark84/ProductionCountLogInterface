package ProductionCountLog.persistence;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.entity.User;
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


/**
 * The type Shift dao.
 */
public class ShiftDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * Gets all users.
     *
     * @return the all users
     */
    public List<Shift> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Shift> query = builder.createQuery(Shift.class);
        Root<Shift> root = query.from(Shift.class);
        List<Shift> shifts = session.createQuery(query).getResultList();
        session.close();
        return shifts;
    }

    /**
     * public List<User> getUserByLastName(String lastName) {
     * Session session = sessionFactory.openSession();
     * CriteriaBuilder builder = session.getCriteriaBuilder();
     * CriteriaQuery<User> query = builder.createQuery(User.class);
     * Root<User> root = query.from(User.class);
     * Expression<String> propertyPath = root.get("lastName");
     * query.where(builder.like(propertyPath, "%" + lastName + "%"));
     * List<User> users = session.createQuery(query).getResultList();
     * session.close();
     * return users;
     * } 
     * /

     /** @param id the id
     *
     * @return the by id
     */
    public Shift getById(int id){
        Session session = sessionFactory.openSession();
        Shift shift = session.get(Shift.class, id);
        session.close();
        return shift;
    }

    /**
     * update shift
     *
     * @param shift Shift to be inserted or updated
     */
    public void saveOrUpdate(Shift shift) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(shift);
        session.close();
    }

    /**
     * update shift
     *
     * @param shift User to be inserted or updated
     * @return the int
     */
    public int insert(Shift shift) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(shift);
        transaction.commit();
        logger.debug("Shift value to insert  " + shift);
        session.close();
        return id;
    }


    /**
     * Delete.
     *
     * @param shift the shift
     */
    public void delete(Shift shift) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(shift);
        transaction.commit();
        session.close();
    }


    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Shift> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Shift> query = builder.createQuery( Shift.class );
        Root<Shift> root = query.from( Shift.class );
        List<Shift> shift = session.createQuery( query ).getResultList();

        logger.debug("The list of shifts " + shift);
        session.close();

        return shift;
    }


    /**
     * Gets by property equal.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property equal
     */
    public List<Shift> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for shift with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Shift> query = builder.createQuery( Shift.class );
        Root<Shift> root = query.from( Shift.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Shift> shifts = session.createQuery( query ).getResultList();

        session.close();
        return shifts;
    }


    /**
     * Gets by property like.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property like
     */
    public List<Shift> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for shift with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Shift> query = builder.createQuery( Shift.class );
        Root<Shift> root = query.from( Shift.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Shift> shifts = session.createQuery( query ).getResultList();
        session.close();
        return shifts;
    }


}
