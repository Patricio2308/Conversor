package Conversor;

public abstract class MainValues {

    private String modo = "";
    private String[] list = {};

    protected void getValuesToConvertion(int value){
        //Obtiene los valores del comboBox
    }

    protected void cargarModulo(){};
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
}
