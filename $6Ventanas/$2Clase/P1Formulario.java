package $6Ventanas.$2Clase;
//Dacceso al uso de la información que se localiza en la libreria de SWING
import javax.swing.*;

//Declaración clase y heredando el contenido de JFrame
public class P1Formulario  extends JFrame{
   
    //Delcaración de objeto tipo Jlable
    private JLabel label1;

    //Creación del metodo
    public P1Formulario(){
        setLayout(null);
        label1 = new JLabel("Saludos de carlos");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }


    public static void main(String[] args) {
        P1Formulario formulario1 = new P1Formulario();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}
