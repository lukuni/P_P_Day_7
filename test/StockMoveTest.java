import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockMoveTest {

    @Test
    public void testMoveProduct() {
        Product p = new Product("Shampoo", 5000, 2, "Hygiene", "ABC123");
        Location from = new Location("From");
        Location to = new Location("To");

        from.addProduct(p);

        StockMove mover = new StockMove(from, to);
        mover.moveProduct(p);

        assertFalse(from.getProducts().contains(p));
        assertTrue(to.getProducts().contains(p));
    }
}