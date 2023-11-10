package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P13AreayVolumenEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, volumen, radio;

        System.out.println("************Area y Volumen de una Esfera.***********");


        System.out.println("Introduce el valor del radio: ");
        radio = sc.nextDouble();


        area = (4 * Math.PI) * (Math.pow(radio, 2));
        volumen = (4 * Math.PI * Math.pow(radio,3))/3;

        System.out.println("Area: "+ area);
        System.out.println("Volumen: "+ volumen);

        sc.close();
    }
    
}
