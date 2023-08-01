import java.util.Scanner;

public class MainCurrency {

    static void selection(Scanner scanner){
        System.out.println("Menú moneda");
        System.out.println("elija su conversion de moneda:");
        System.out.println( "1 Peso a Dolar\n" +
                            "2 Peso a Euro\n" +
                            "3 Peso a Libra Esterlina\n" +
                            "4 Peso a Yen\n" +
                            "5 Peso a Won\n" +
                            "6 Dolar a Peso\n" +
                            "7 Euro a Peso\n" +
                            "8 Libra Esterlina a Peso\n" +
                            "9 Yen a Peso\n" +
                            "10 Won a Peso\n" +
                            "11 Volver");
        switch (scanner.nextInt()){
            case 1:
                currencyConvertion(scanner,273.65361,1);
                break;
            case 2:
                currencyConvertion(scanner,301,1);
                break;
            case 3:
                currencyConvertion(scanner,352.490,1);
                break;
            case 4:
                currencyConvertion(scanner,1.93122,1);
                break;
            case 5:
                currencyConvertion(scanner,0.215008,1);
                break;
            case 6:
                currencyConvertion(scanner,1,273.65361);
                break;
            case 7:
                currencyConvertion(scanner,1,301.980);
                break;
            case 8:
                currencyConvertion(scanner,1,352.490);
                break;
            case 9:
                currencyConvertion(scanner,1,1.93122);
                break;
            case 10:
                currencyConvertion(scanner,1,0.215008);
                break;
            case 11:
                Main.menuConversor(scanner);
            default:
                MainCurrency.selection(scanner);
        }
    }

    private static void currencyConvertion(Scanner scanner, double baseCurrency, double finalCurrency) {
        System.out.println("Ingrese la cantidad a convertir");
        double quantity = scanner.nextDouble();
        double res = quantity * finalCurrency / baseCurrency;
        //DecimalFormat deci = new DecimalFormat("#.##");
        //System.out.println("El resultado es "+ deci.format(res));
        System.out.println("El resultado es "+ res);

    }

}
