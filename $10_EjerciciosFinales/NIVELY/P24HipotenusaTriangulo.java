package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Calcular la hipotenusa de un triángulo rectángulo.
 */
public class P24HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Hipo, a, b;

        System.out.println("***** Hipotenusa de un triangulo *****");

        System.out.println("Introduce el cateto opuesto: ");
        a = sc.nextDouble();
        
        System.out.println("Introduce el cateto adyacente: ");
        b = sc.nextDouble();

        Hipo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("El valor de la hipotenusa es: "+Hipo);

        sc.close();
    }
}
