import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("Seleccione que desea convertir");
        System.out.println("1-Moneda");
        System.out.println("2-Temperatura");
        System.out.println("3-Distancia");
        System.out.println("------------------------------");
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();

        switch (res){
            case 1:
                System.out.println("eligió moneda");
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
        scanner.close();
        System.out.println("------------------------------");
    }
}