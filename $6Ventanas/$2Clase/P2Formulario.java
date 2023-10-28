package $6Ventanas.$2Clase;

import javax.swing.*;

public class P2Formulario extends JFrame {
    public P2Formulario(){
        setLayout(null);
    }

    public static void main(String[] args) {
        P2Formulario formulario1 = new P2Formulario();
        formulario1.setBounds(0,0,400,550);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }
}
