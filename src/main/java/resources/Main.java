public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        try {
            manager.addProduct("Сүү", 1200.0, 3, "Хүнс", "123456789");
            manager.addProduct("Кофе", -1500.0, 5, "Уух зүйл", "123"); // Санаатай алдаа
        } catch (IllegalArgumentException e) {
            System.out.println("⚠ Алдаа: " + e.getMessage());
        }

        for (Product p : manager.getProducts()) {
            System.out.println(p);
        }
    }
}