package Conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        menuConversor(scanner);
        scanner.close();

    }

    public static void menuConversor(Scanner scanner){
        System.out.println("------------------------------");
        System.out.println("Seleccione que desea convertir");
        System.out.println("1-Moneda");
        System.out.println("2-Temperatura");
        System.out.println("3-Distancia");
        System.out.println("------------------------------");

        int res = scanner.nextInt();
        switch (res){
            case 1:
                MainCurrency.selection(scanner);
                break;
            case 2:
                MainTemperature.selection(scanner);
                break;
            case 3:
                MainDistance.selection(scanner);
                break;
            default:
                System.out.println("No se ha elegido una opción adecuada");
        }

        System.out.println("------------------------------");
    }
}