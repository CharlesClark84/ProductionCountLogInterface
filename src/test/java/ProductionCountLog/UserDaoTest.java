package ProductionCountLog;

import ProductionCountLog.entity.User;
import ProductionCountLog.persistence.UserDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserDaoTest {

    UserDao dao;


    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        ProductionCountLog.Database database = ProductionCountLog.Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();
    }

    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertEquals("Charles", retrievedUser.getFirstName());
        assertEquals("Clark", retrievedUser.getLastName());
    }




    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllSuccess() {
        List<User> users = dao.getAll();
        assertEquals(1, users.size());
    }

    /**
     * Verify successful update of user

    @Test
    void updateSuccess() {
        String newLastName = "Clark"; //needs to be fixed
        User user = dao.getById(1);
        user.setLastName(newLastName);
        dao.saveOrUpdate(user);
        User retrievedUser = dao.getById(1);
        assertEquals(user, retrievedUser);
    }

     */

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "Clark");
        assertEquals(1, users.size());

    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "c");
        assertEquals(1, users.size());
    }


}
