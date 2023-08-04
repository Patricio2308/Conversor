package Conversor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTemperature {
    private static double resultado;
    static void selection(Scanner scanner){
        System.out.println("Menú temperatura");
        System.out.println("elija su conversion de temperatura:");
        System.out.println( "1 °C a °F\n" +
                            "2 °F a °C\n" +
                            "3 °C a °K\n" +
                            "4 °K a °C\n" +
                            "5 °F a °K\n" +
                            "6 °K a °F\n" +
                            "7 Volver");
        //scanner.nextInt();
        switch (scanner.nextInt()){
            case 1:
                tempConvertion(1,"°C","°F",scanner);
                break;
            case 2:
                tempConvertion(2,"°F","°C",scanner);
                break;
            case 3:
                tempConvertion(3,"°C","°K",scanner);
                break;
            case 4:
                tempConvertion(4,"°K","°C",scanner);
                break;
            case 5:
                tempConvertion(5,"°F","°K",scanner);
                break;
            case 6:
                tempConvertion(6,"°K","°F",scanner);
                break;
            case 7:
                Main.menuConversor(scanner);
            default:
                MainTemperature.selection(scanner);
        }
    }

    public static void tempConvertion(int modo, String orig,String salid,Scanner scanner){
        System.out.println("Seleccione la cantidad de grados en "+ orig);
        double temp = scanner.nextDouble();
        switch (modo){
            case 1:
                resultado = (temp * 1.8) + 32;
                break;
            case 2:
                resultado = (temp - 32) / 1.8;
                break;
            case 3:
                resultado = temp + 273.15;
                break;
            case 4:
                resultado = temp - 273.15;
                break;
            case 5:
                resultado = (temp + 459.67) / 1.8;
                break;
            case 6:
                resultado = (temp * 1.8) - 459.67;
                break;
        }
        DecimalFormat deci = new DecimalFormat("#.##");
        System.out.println("El resultado es "+ deci.format(resultado) + salid);
    }

}
