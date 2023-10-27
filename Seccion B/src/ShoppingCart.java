import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private ReceiptSender receiptSender;

    public ShoppingCart() {
        //Constructor
    }

    public void addProduct(Product product) {
        //Codigo para añadir producto
    }

    public void removeProduct(Product product) {
        //Codigo para remover producto
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        //Codigo para calcular precio total
        return totalPrice;
    }

    public void checkout() {
        receiptSender.sendReceipt(products, calculateTotalPrice());
    }
}
