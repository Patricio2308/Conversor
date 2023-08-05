package Conversor;

import java.text.DecimalFormat;

public class MainCurrency extends MainValues {
    private static Double cotizacion = getTag("ARG","USD");
    String modoActual = "Moneda";
    String[] curencyList = {"Peso a Dolar","Peso a Euro","Peso a Libra Esterlina","Peso a Yen","Peso a Won",
                                "Dolar a Peso","Euro a Peso","Libra Esterlina a Peso","Yen a Peso","Won a Peso"};
    @Override
    protected void cargarModulo(){
        setModo(modoActual);
        setList(curencyList);
    }

    private static Double getTag(String paisBase, String paisFinal){
        return Tasas.getHash(paisFinal) / Tasas.getHash(paisBase);
    }
    @Override
    protected void getValuesToConvertion(int valor){
        switch (valor){
            case 1 :
                cotizacion = getTag("ARG","USD");
                symbols("$","$");
                break;
            case 2:
                cotizacion = getTag("ARG","EU");
                symbols("$","€");
                break;
            case 3:
                cotizacion = getTag("ARG","GBP");
                symbols("$","£");
                break;
            case 4:
                cotizacion = getTag("ARG","JPY");
                symbols("$","¥");
                break;
            case 5:
                cotizacion = getTag("ARG","KRW");
                symbols("$","₩");
                break;
            case 6:
                cotizacion = getTag("USD","ARG");
                symbols("$","$");
                break;
            case 7:
                cotizacion = getTag("EU","ARG");
                symbols("€","$");
                break;
            case 8:
                cotizacion = getTag("GBP","ARG");
                symbols("£","$");
                break;
            case 9:
                cotizacion = getTag("JPY","ARG");
                symbols("¥","$");
                break;
            case 10:
                cotizacion = getTag("KRW","ARG");
                symbols("₩","$");
                break;
            default:
                System.out.println();
    }}
    @Override
    public String convertion(Double quantity) {
        Double res = null;
        try {
            res = quantity * cotizacion;
        } catch (Exception e){
            System.out.println("error de calculo " + e.getMessage());
        }
        DecimalFormat deci = new DecimalFormat(getFinalSymbol() + " #.##");
        return deci.format(res);
    }

}
