package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P17AreayVolumenCono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, h, g, area, volumen;

        System.out.println("********Area y Volumen de un cono ***********");

        System.out.println("Introduce el valor del radio: ");
        r = sc.nextDouble();

        System.out.println("Introduce el valor de la altura: ");
        h = sc.nextDouble();

        System.out.println("Introduce el valor de generatriz: ");
        g = sc.nextDouble();

        area = Math.PI * (r*(r + g));
        volumen = ((1/3)*(Math.PI)) * Math.pow(r, 2) * h;

        System.out.println("El valor del area es: "+area);
        System.out.println("El valor del volumen: "+volumen);
        
        sc.close();
    }    
}
