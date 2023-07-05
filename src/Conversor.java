public class Conversor {
    private double finalCurrency,baseCurrency;
    private double quantity;

    public double convert(double quantity, double baseCurrency, double finalCurrency) {
        return  quantity * finalCurrency / baseCurrency;
    }


}
