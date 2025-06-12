import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Агуулахын мэдээллийг хадгалах класс.
 * Агуулах нь олон байршил (Location) -ыг агуулна.
 */
public class Warehouse {
    /** Логгер */
    private static final Logger logger = LogManager.getLogger(Warehouse.class);

    /** Агуулахын нэр */
    private String name;

    /** Агуулах дахь байршлуудын жагсаалт */
    private List<Location> locations;

    /**
     * Шинэ агуулах үүсгэх конструктор.
     *
     * @param name Агуулахын нэр
     */
    public Warehouse(String name) {
        this.name = name;
        this.locations = new ArrayList<>();
        logger.info("Агуулах үүсгэгдлээ: {}", name);
    }

    /**
     * Агуулахад шинэ байршил нэмнэ.
     *
     * @param loc Нэмэх байршил
     */
    public void addLocation(Location loc) {
        if (loc == null) {
            logger.error("null байршил нэмэх гэж оролдов");
            throw new IllegalArgumentException("Байршил хоосон байж болохгүй");
        }
        locations.add(loc);
        logger.info("Байршил нэмэгдсэн: {}", loc);
    }

    /**
     * Агуулах дахь байршлуудыг буцаана.
     *
     * @return байршлуудын жагсаалт
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Агуулахын нэрийг буцаана.
     *
     * @return агуулахын нэр
     */
    public String toString() {
        return name;
    }
}
