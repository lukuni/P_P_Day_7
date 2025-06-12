/**
 * Барааг нэг байршлаас нөгөө байршил руу шилжүүлэх үйлдлийг гүйцэтгэх класс.
 */
public class StockMove {
    /** Барааг шилжүүлэх эхний байршил */
    Location from;

    /** Бараа очих байршил */
    Location to;

    /**
     * Шилжүүлэлтийн объектыг үүсгэнэ.
     * 
     * @param from Барааг шилжүүлэх эхний байршил
     * @param to   Бараа очих байршил
     */
    public StockMove(Location from, Location to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Тодорхой барааг эхний байршлаас хасч, хоёр дахь байршилд нэмнэ.
     * 
     * @param p Шилжүүлэх бараа
     */
    public void moveProduct(Product p) {
        from.removeProduct(p);
        to.addProduct(p);
    }
}