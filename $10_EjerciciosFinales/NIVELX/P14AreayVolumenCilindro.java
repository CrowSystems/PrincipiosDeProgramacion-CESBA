package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P14AreayVolumenCilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volumen, area, radio, altura;

        System.out.println("*************Area y volumen de un cilindro************");

        System.out.println("Introduce el valor del radio: ");
        radio = sc.nextDouble();

        System.out.println("Introduce el valor de la altura: ");
        altura = sc.nextDouble();
        //Formulas para obtener el area y volumen de un cilindro
        volumen = Math.PI * Math.pow(radio,2) * altura;
        area = (2 * Math.PI) * (radio* (radio + altura));

        System.out.println("El volumen es: " + volumen);    
        System.out.println("El area es: " + area);

        sc.close();
    }
}
