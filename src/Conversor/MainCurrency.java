package Conversor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainCurrency {

    private static String modo = "moneda";
    private static Double cotizacion;
    private static String[] lista = {"Peso a Dolar","Peso a Euro","Peso a Libra Esterlina","Peso a Yen","Peso a Won",
                                "Dolar a Peso","Euro a Peso","Libra Esterlina a Peso","Yen a Peso","Won a Peso"};
    public static String getModo() {
        return modo;
    }
//    static void selection(Scanner scanner){
//        System.out.println("Menú "+ modo);
//        System.out.println("elija su conversion de moneda:");
//        System.out.println( "1 Peso a Dolar\n" +
//                            "2 Peso a Euro\n" +
//                            "3 Peso a Libra Esterlina\n" +
//                            "4 Peso a Yen\n" +
//                            "5 Peso a Won\n" +
//                            "6 Dolar a Peso\n" +
//                            "7 Euro a Peso\n" +
//                            "8 Libra Esterlina a Peso\n" +
//                            "9 Yen a Peso\n" +
//                            "10 Won a Peso\n" +
//                            "11 Volver");

    private static Double getTag(String paisBase, String paisFinal){
        return Tasas.hash.get(paisFinal) / Tasas.hash.get(paisBase);
    }
    public static void getCurrency(int valor){
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

    public static String currencyConvertion(Double quantity) {
        DecimalFormat deci = new DecimalFormat("#.##");
        Double res = null;
        try {
            res = quantity * cotizacion;
        } catch (Exception e){
            System.out.println("error de calculo " + e.getMessage());
        }
        return deci.format(res);
    }

    public static String[] getLista() {
        return lista;
    }
}
