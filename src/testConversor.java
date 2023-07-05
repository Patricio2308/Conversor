import javax.swing.*;

public class testConversor {
    public static void main(String[] args) {
        String cadena;
        Conversor trans = new Conversor();

        Currency arg = new Currency("arg", 267);

        cadena = JOptionPane.showInputDialog(null,"ingrese algo","inicial");
        JOptionPane.showMessageDialog(null,"El valor introducido es "+ cadena);

        double valor = trans.convert(1000, 5.13174, 1);
        System.out.println(valor);
        //System.out.println("El valor introducido es "+ cadena);
    }
}
