/**
 * Бараа бүтээгдэхүүнийг илэрхийлэх класс.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;
    private String barcode;

    public Product(String name, double price, int quantity, String category, String barcode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return name + " (" + price + "₮) x" + quantity + " [" + category + "] Barcode: " + barcode;
    }

    // Getters (шаардлагатай бол)
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getCategory() { return category; }
    public String getBarcode() { return barcode; }
}