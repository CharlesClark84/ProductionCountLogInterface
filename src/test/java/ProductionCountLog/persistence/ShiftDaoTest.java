package ProductionCountLog.persistence;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.spi.LocaleServiceProvider;

import static org.junit.jupiter.api.Assertions.*;

class ShiftDaoTest {
    GenericDao dao;

    @BeforeEach
    void setUp() {
        ProductionCountLog.Database database = ProductionCountLog.Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(Shift.class);
    }

    @Test
    void insertSuccess() {

        Shift shift = new Shift(1, "12/3/18", 1, "213 filter", 1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1);
        int id = dao.insert(shift);
        assertNotEquals(0, id);
        Shift insertedShift = (Shift) dao.getById(id);
        assertEquals(insertedShift, insertedShift);

    }

    @Test
    void getByIdSuccess() {
        Shift retrievedShift = (Shift)dao.getById(16);
        assertEquals("213 Air Filter", retrievedShift.getProductName());
        assertEquals("6.5", retrievedShift.getHoursWorked());
    }

    /**
     * Verify successful delete of shift
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(12));
        assertNull(dao.getById(12));
    }

    @Test
    void getAllSuccess() {
        List<Shift> shifts = dao.getAll();
        assertEquals(35, shifts.size());
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Shift> shifts = dao.getByPropertyLike("productName", "213 Air Filter");
        assertEquals(8, shifts.size());

    }

    @Test
    void getByPropertyLikeSuccess() {
        List<Shift> shifts = dao.getByPropertyLike("productName", "4");
        assertEquals(2, shifts.size());
    }
}


