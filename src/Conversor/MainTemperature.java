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
    public String convertion(Double temp){

        switch (tipoEcuacion){
            case 1:
                resultado = (temp * 1.8) + 32;
                symbols("°C","°F");
                break;
            case 2:
                resultado = (temp - 32) / 1.8;
                symbols("°F","°C");
                break;
            case 3:
                resultado = temp + 273.15;
                symbols("°C","°K");
                break;
            case 4:
                resultado = temp - 273.15;
                symbols("°K","°C");
                break;
            case 5:
                resultado = (temp + 459.67) / 1.8;
                symbols("°F","°K");
                break;
            case 6:
                resultado = (temp * 1.8) - 459.67;
                symbols("°K","°F");
                break;
            default:
                System.out.println();
        }
        DecimalFormat deci = new DecimalFormat("#.##" + getFinalSymbol());
        return deci.format(resultado);
    }

}
