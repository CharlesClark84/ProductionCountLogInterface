package ProductionCountLog.controller;

import ProductionCountLog.entity.User;
import ProductionCountLog.entity.WeatherConfirm;
import ProductionCountLog.persistence.GenericDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WeatherDaoTest {

    GenericDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        ProductionCountLog.Database database = ProductionCountLog.Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(WeatherConfirm.class);
    }

    @Test
    void getByIdSuccess() {
        WeatherConfirm retrieved = (WeatherConfirm) dao.getById(2);
        assertEquals("yes", retrieved.getConfirm());
        assertEquals("12/1/18", retrieved.getDate());
    }

    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));
    }

    @Test
    void getAllSuccess() {
        List<WeatherConfirm> weather = dao.getAll();
        assertEquals(1, weather.size());
    }

}
