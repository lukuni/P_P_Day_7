import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StockMove {
    private static final Logger logger = LogManager.getLogger(StockMove.class);

    Location from;
    Location to;

    public StockMove(Location from, Location to) {
        this.from = from;
        this.to = to;
        logger.debug("StockMove объект үүссэн: from={} to={}", from.getName(), to.getName());
    }

    public void moveProduct(Product p) {
        logger.info("Бараа шилжүүлж байна: {} -с {} рүү", p.getName(), from.getName(), to.getName());
        try {
            from.removeProduct(p);
            to.addProduct(p);
            logger.info("Бараа амжилттай шилжлээ: {}", p.getName());
        } catch (IllegalArgumentException e) {
            logger.error("Алдаа гарлаа барааг шилжүүлэхэд: {}", e.getMessage());
            throw e; // дахин шидэх боломжтой
        }
    }
}
