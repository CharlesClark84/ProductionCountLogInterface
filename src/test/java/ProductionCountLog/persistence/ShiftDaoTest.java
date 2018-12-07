package ProductionCountLog.persistence;

import ProductionCountLog.entity.Shift;
import ProductionCountLog.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.spi.LocaleServiceProvider;

import static org.junit.jupiter.api.Assertions.*;

class ShiftDaoTest {
    GenericDao dao;

    @BeforeEach
    void setUp() {
         dao = new GenericDao(Shift.class);
    }
    @Test
    void insertSuccess() {

        Shift shift = new Shift(1,"12/3/18", 1, "213 filter", 1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1);
        int id = dao.insert(shift);
        assertNotEquals(0,id);
        Shift insertedShift = (Shift)dao.getById(id);
        assertEquals("???", insertedShift);

    }


}