package Conversor;

import java.text.DecimalFormat;

public class MainDistance extends MainValues{

    private static Double proporcion;
    String[] distanceList = {"Centímetros a Metros",
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
                symbols("cm","m");
                break;
            case 2:
                proporcion = 100.0;
                symbols("m","cm");
                break;
            case 3:
                proporcion = 0.001;
                symbols("m","km");
                break;
            case 4:
                proporcion = 1000.0;
                symbols("km","m");
                break;
            case 5:
                proporcion = 0.3048;
                symbols("ft","m");
                break;
            case 6:
                proporcion = 1/0.3048;
                symbols("m","ft");
                break;
            default:
                System.out.println();
        }
    }
    @Override
    protected void cargarModulo(){
        setList(distanceList);
        setModo(modoActual);
    }
    @Override
    public String convertion(Double valor){
        DecimalFormat deci = new DecimalFormat("#.##" + getFinalSymbol());
        Double res = valor * proporcion;
        return deci.format(res);
    }
}
