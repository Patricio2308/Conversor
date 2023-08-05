package Conversor;

import java.text.DecimalFormat;

public class MainCurrency extends MainValues {
    private static Double cotizacion;
    String modoActual = "Moneda";
    String[] curencyList = {"Peso a Dolar","Peso a Euro","Peso a Libra Esterlina","Peso a Yen","Peso a Won",
                                "Dolar a Peso","Euro a Peso","Libra Esterlina a Peso","Yen a Peso","Won a Peso"};
    @Override
    protected void cargarModulo(){
        setList(curencyList);
        setModo(modoActual);
    }

    private static Double getTag(String paisBase, String paisFinal){
        return Tasas.getHash(paisFinal) / Tasas.getHash(paisBase);
    }
    @Override
    protected void getValuesToConvertion(int valor){
        switch (valor){
            case 1 :
                cotizacion = getTag("ARG","USD");
                break;
            case 2:
                cotizacion = getTag("ARG","EU");
                break;
            case 3:
                cotizacion = getTag("ARG","GBP");
                break;
            case 4:
                cotizacion = getTag("ARG","JPY");
                break;
            case 5:
                cotizacion = getTag("ARG","KRW");
                break;
            case 6:
                cotizacion = getTag("USD","ARG");
                break;
            case 7:
                cotizacion = getTag("EU","ARG");
                break;
            case 8:
                cotizacion = getTag("GBP","ARG");
                break;
            case 9:
                cotizacion = getTag("JPY","ARG");
                break;
            case 10:
                cotizacion = getTag("KRW","ARG");
                break;
            default:
                System.out.println("error de cotización");;
    }}
    @Override
    public String convertion(Double quantity) {
        DecimalFormat deci = new DecimalFormat("#.##");
        Double res = null;
        try {
            res = quantity * cotizacion;
        } catch (Exception e){
            System.out.println("error de calculo " + e.getMessage());
        }
        return deci.format(res);
    }

}
