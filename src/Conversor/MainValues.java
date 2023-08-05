package Conversor;

public abstract class MainValues {

    private String modo = "";
    private String[] list = {};


    private String inicialSymbol = "$";
    private String finalSymbol = "$";

    protected abstract void getValuesToConvertion(int value);
        //Obtiene los valores del comboBox

    protected void cargarModulo(){
        //Carga lista y modo al seleccionar el elJMenuItem
    };
    protected abstract String convertion(Double valor);

    protected void symbols(String ini, String fin){
        inicialSymbol = ini;
        finalSymbol = fin;
    }

    public String[] getList() {
        return list;
    }
    public void setList(String[] currentList) {
        list = currentList;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }
    public String getInicialSymbol() {
        return inicialSymbol;
    }

    public String getFinalSymbol() {
        return finalSymbol;
    }
}
