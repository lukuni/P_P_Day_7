import java.util.ArrayList;
import java.util.List;

/**
 * Байршлын (Location) анги нь тухайн байршилд хадгалагдсан бараа бүтээгдэхүүнүүдийн жагсаалтыг агуулна.
 */
public class Location {

    /** Байршлын нэр */
    private String name;

    /** Байршилд хадгалагдсан бараа бүтээгдэхүүнүүдийн жагсаалт */
    private List<Product> products;

    /**
     * Location объектыг үүсгэнэ.
     * @param name байршлын нэр
     */
    public Location(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    /**
     * Байршилд шинэ бараа бүтээгдэхүүн нэмнэ.
     * @param p нэмэх бараа бүтээгдэхүүн
     */
     
    public void addProduct(Product p) {
    if (p == null) {
        throw new IllegalArgumentException("Product cannot be null");
    }
    products.add(p);
}

    /**
     * Байршлаас тодорхой бараа бүтээгдэхүүнийг устгана.
     * @param p устгах бараа бүтээгдэхүүн
     */
    public void removeProduct(Product p) {
        products.remove(p);
    }

    /**
     * Байршилд байгаа бүх бараа бүтээгдэхүүний жагсаалтыг буцаана.
     * @return бараа бүтээгдэхүүний List
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Байршлын нэрийг буцаана.
     * @return байршлын нэр
     */
    public String getName() {
        return name;
    }

    /**
     * Байршлын мэдээллийг текст хэлбэрээр буцаана.
     * @return байршлын нэр
     */
    @Override
    public String toString() {
        return name;
    }
}