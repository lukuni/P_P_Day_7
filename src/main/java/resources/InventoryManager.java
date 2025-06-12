import java.util.ArrayList;
import java.util.List;

/**
 * Бараа нэмэх, шалгах логикыг хариуцах класс.
 */
public class InventoryManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int quantity, String category, String barcode) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Барааны нэр хоосон байж болохгүй.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Үнэ сөрөг байж болохгүй.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Тоо хэмжээ сөрөг байж болохгүй.");
        }
        if (quantity > 100) {
            throw new IllegalArgumentException("Нэг бүтээгдэхүүний тоо хэмжээ 100-аас их байж болохгүй.");
        }
        if (barcode == null || !barcode.matches("\\d{4,13}")) {
            throw new IllegalArgumentException("Баркод 4-13 оронтой тоо байх ёстой.");
        }

        Product p = new Product(name, price, quantity, category, barcode);
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}