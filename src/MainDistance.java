import com.sun.tools.javac.Main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainDistance {

    public static void selection(Scanner scanner){
        System.out.println("Menú distancias");
        System.out.println("elija su conversion de distancia:");
        System.out.println( "1 Centímetros a Metros\n" +
                            "2 Metros a Centímetros\n" +
                            "3 Metros a Kilometros\n" +
                            "4 Kilometros a Metros\n" +
                            "5 Pies a Metros\n" +
                            "6 Metros a Pies");

        switch (scanner.nextInt()){
            case 1:
                distConvertion(0.01,"cm","m",scanner);
                break;
            case 2:
                distConvertion(100,"m","cm",scanner);
                break;
            case 3:
                distConvertion(0.001,"m","km",scanner);
                break;
            case 4:
                distConvertion(1000,"km","m",scanner);
                break;
            case 5:
                distConvertion(0.3048,"ft","m",scanner);
                break;
            case 6:
                distConvertion(1/0.3048,"m","ft",scanner);
                break;
            default:
                ;
        }
    }

    private static void distConvertion(double prop, String orig, String dest, Scanner scanner){
        System.out.println("Ingrese su valor en "+ orig +" a convertir:");
        double valor = scanner.nextDouble();

        double res = valor * prop;
        DecimalFormat deci = new DecimalFormat("#.##");
        System.out.println("El resultado es "+ deci.format(res) + dest);
    }
}
