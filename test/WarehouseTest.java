import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Warehouse классын туршилтын тест.
 */
public class WarehouseTest {

    @Test
    public void testAddLocation() {
        Warehouse wh = new Warehouse("Main");
        Location loc = new Location("Sub");
        wh.addLocation(loc);

        assertTrue(wh.getLocations().contains(loc), "Location should be added");
    }
}