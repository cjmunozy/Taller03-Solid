public interface ReceiptSender {
    void sendReceipt(List<Product> products, double totalPrice);
}