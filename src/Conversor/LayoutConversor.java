package Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LayoutConversor extends JFrame{
    private JPanel panel;
    private JPanel BarraMenu;
    private JMenu menuConversor;
    private JMenuItem item1, item2, item3, sobreMenuItem, cerrarMenuItem;
    private JPanel panelCentral;
    private JPanel PanelBotones, buttonX;
    private JButton calcButton, cleanButton;
    private JMenu masMenu;
    private JTextPane textPane1,textPane2;
    private JComboBox comboBox1;
    private JButton botonConvertir;
    private JLabel xClose;
    private JLabel _Min;


    public LayoutConversor() {

        sobreMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Desarrollado por Patricio Giménez - 2023");
            }
        });
        cerrarMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        xClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        _Min.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setState(Frame.ICONIFIED);
            }
        });
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola");
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setText("");
                textPane2.setText("");
            }
        });
    }
    public void cajasDeTExto(){

    }

    public static void main(String[] args) {
        LayoutConversor h = new LayoutConversor();
        h.setSize(500,300);
        h.setTitle("Conversor");
        h.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        h.setLocationRelativeTo(null);
        h.setContentPane(h.panel);
        h.setResizable(false);
        h.setUndecorated(true);


        h.setVisible(true);
    }

}
