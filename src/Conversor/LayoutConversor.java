package Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Scanner;

public class LayoutConversor extends JFrame{
    private JPanel panel;
    private JPanel BarraMenu;
    private JMenu menuConversor;
    private JMenuItem item1, item2, item3, sobreMenuItem, cerrarMenuItem;
    private JPanel panelCentral;
    private JPanel PanelBotones, buttonX;
    private JButton calcButton, cleanButton;
    private JMenu masMenu;
    private JTextField textPane1,textPane2;
    private JComboBox comboBox1;
    private JLabel xClose;
    private JLabel _Min;
    private JLabel labelMode;
    private String textValue;
    private MainValues modoC = new MainCurrency();


    public LayoutConversor() {

        textPane1.setBorder(null);
        textPane2.setBorder(null);
        modoC.cargarModulo();
        cargarListaOpciones();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoC.getValuesToConvertion(comboBox1.getSelectedIndex() + 1);
            }
        });
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoC = new MainCurrency();
                modoC.cargarModulo();
                cargarLabelMode(modoC.getModo());
                cargarListaOpciones();
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoC = new MainDistance();
                modoC.cargarModulo();
                cargarLabelMode(modoC.getModo());
                cargarListaOpciones();
            }
        });
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modoC = new MainTemperature();
                modoC.cargarModulo();
                cargarLabelMode(modoC.getModo());
                cargarListaOpciones();
            }
        });

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
                System.out.println("Estamos en modo "+ modoC.getModo());
                try {
                    if(comboBox1.getSelectedItem() != "Select" && !textPane1.getText().trim().isEmpty()){
                        textValue = modoC.convertion(Double.parseDouble(textPane1.getText()));
                        textPane2.setText(textValue);
                    }
                } catch (Exception err){
                    textPane1.setText("");
                }
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
    public void cargarListaOpciones(){
        comboBox1.removeAllItems();
        for (String e: modoC.getList()) {
            comboBox1.addItem(e);
        }
    }
    public void cargarLabelMode(String modo){
        labelMode.setText("Modo " + modo);
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
