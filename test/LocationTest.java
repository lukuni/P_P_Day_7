import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Location классын туршилтын тест.
 */
public class LocationTest {

    @Test
    public void testAddProduct() {
        Location loc = new Location("TestLocation");
        Product p = new Product("Test", 1000.0, 1, "TestCat", "12345");
        loc.addProduct(p);

        List<Product> products = loc.getProducts();
        assertTrue(products.contains(p), "Product should be added");
    }

    @Test
    public void testRemoveProduct() {
        Location loc = new Location("TestLocation");
        Product p = new Product("Test", 1000.0, 1, "TestCat", "12345");
        loc.addProduct(p);
        loc.removeProduct(p);

        List<Product> products = loc.getProducts();
        assertFalse(products.contains(p), "Product should be removed");
    }
    @Test
    void addNullProduct_shouldThrowException() {
        Location loc = new Location("TestLocation");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            loc.addProduct(null);
        });
        assertEquals("Product cannot be null", exception.getMessage());
    }

    @Test
    void removeNonExistingProduct_shouldNotFail() {
        Location loc = new Location("TestLocation");
        Product p = new Product("TestProduct", 100, 1, "Category", "12345");
        // Removing product which was never added, should do nothing but not fail
        loc.removeProduct(p);
        assertTrue(loc.getProducts().isEmpty());
    }
}