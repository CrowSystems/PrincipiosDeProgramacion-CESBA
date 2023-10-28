package $6Ventanas.$2Clase;

import javax.swing.*;

public class P3Formulario extends JFrame{
    private JLabel label1;
    private JLabel label2;
    
    public P3Formulario(){
        setLayout(null);
        label1 = new JLabel("Interfaz grafica");
        label1.setBounds(10,10,300,30);
        add(label1);
        
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    public static void main(String[] args) {
        P3Formulario formulario1 = new P3Formulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
