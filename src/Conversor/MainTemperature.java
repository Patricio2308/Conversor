package Conversor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTemperature extends MainValues{
    private static double resultado;
    private static int tipoEcuacion;

    String[] distanceList = {"Celsius a Fahrenheit",
                             "Fahrenheit a Celsius",
                             "Celsius a Kelvin",
                             "Kelvin a Celsius",
                             "Fahrenheit a Kelvin",
                             "Kelvin a Fahrenheit"};
    String modoActual = "Temperatura";

    protected void getValuesToConvertion(int value){
        tipoEcuacion = value;
    }
    @Override
    protected void cargarModulo(){
        setModo(modoActual);
        setList(distanceList);
    };

    @Override
    protected String convertion(Double temp){
        DecimalFormat deci = new DecimalFormat("#.##");

        switch (tipoEcuacion){
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
            default:
                System.out.println("Error");
        }
        return deci.format(resultado);
    }

}
