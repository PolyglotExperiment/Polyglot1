package tests;

import dao.LandmarkDAO;
import ef.qb.core.QueryBuilder;
import java.util.List;
import model.Landmark;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntegrationTest {

    private static LandmarkDAO landmarkDAO;

    @BeforeAll
    @SuppressWarnings("unused")
    static void setUp() {
        landmarkDAO = QueryBuilder.create(LandmarkDAO.class);
    }

    @Test
    void testGetLandmarkByName() {
        List<Landmark> result = landmarkDAO.getLandmarkByName("Leaning Tower of Pisa");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Leaning Tower of Pisa".equals(l.getName())), "All results should have name 'Leaning Tower of Pisa'");

    }

    @Test
    void testGetLandmarkByInauguration() {
        List<Landmark> result = landmarkDAO.getLandmarkByInauguration(1372);
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> 1372 == l.getInauguration()), "All results should have inauguration date '1372'");

    }

    @Test
    void testGetLandmarkByLocation() {
        List<Landmark> result = landmarkDAO.getLandmarkByLocation("Pisa");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Pisa".equals(l.getLocation())), "All results should have location 'Pisa'");
    }

    @Test
    void testGetLandmarkByDesigner() {
        List<Landmark> result = landmarkDAO.getLandmarkByDesigner("Bonanno Pisano");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Bonanno Pisano".equals(l.getDesigner())), "All results should have architect designer 'Bonanno Pisano'");
    }

    @Test
    void testGetLandmarkByCategory() {
        List<Landmark> result = landmarkDAO.getLandmarkByCategory("Bell Tower");
        assertNotNull(result);
        assertFalse(result.isEmpty(), "The result list should not be empty");
        assertTrue(result.stream().allMatch(l -> "Bell Tower".equals(l.getCategory())), "All results should have category 'Bell Tower'");
    }
}
