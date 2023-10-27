import java.util.HashMap;
import java.util.Map;

public class IvaCalculator {
    private Map<String, Double> ivaRates = new HashMap<>();

    public IvaCalculator() {
        ivaRates.put("book", 0.0);
        ivaRates.put("clothing", 0.12);
        ivaRates.put("technology", 0.15);
    }

    public double calculateIVA(Product p) {
        double iva = 0;
        //Logica para calcular el iva
        return iva;
    }
}