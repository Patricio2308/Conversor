package Conversor;

import java.text.DecimalFormat;

public class MainDistance extends MainValues{

    private static Double proporcion;
    String[] temperatureList = {"Centímetros a Metros",
                            "Metros a Centímetros",
                            "Metros a Kilometros",
                            "Kilometros a Metros",
                            "Pies a Metros",
                            "Metros a Pies"};
    String modoActual = "Distancia";

    @Override
    protected void getValuesToConvertion(int valor){
        switch (valor){
            case 1:
                proporcion = 0.01;
                break;
            case 2:
                proporcion = 100.0;
                break;
            case 3:
                proporcion = 0.001;
                break;
            case 4:
                proporcion = 1000.0;
                break;
            case 5:
                proporcion = 0.3048;
                break;
            case 6:
                proporcion = 1/0.3048;
                break;
            default:
                System.out.println("Error");
        }
    }
    @Override
    protected void cargarModulo(){
        setList(temperatureList);
        setModo(modoActual);
    }
    @Override
    public String convertion(Double valor){
        DecimalFormat deci = new DecimalFormat("#.##");
        Double res = valor * proporcion;
        return deci.format(res);
    }
}
