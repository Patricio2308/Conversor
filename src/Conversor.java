import java.util.HashMap;

public class Conversor {
    private double finalCurrency,baseCurrency;
    private double quantity;

    //private Tasas values = new Tasas();


    public double convert(double quantity, double baseCurrency, double finalCurrency) {
        return quantity * finalCurrency / baseCurrency;
    }


}
