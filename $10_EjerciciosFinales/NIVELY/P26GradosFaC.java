package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Convertir grados Fahrenheit a grados Celsius.
 */
public class P26GradosFaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g, f;

        System.out.println("***** Conversión de grados Fahrenheit a Celcius *****");

        System.out.println("Introduce los grados a convertir: ");
        f = sc.nextDouble();
        
        g = ((f - 32)/1.8);

        System.out.println("Fahrenheit: "+ f);
        System.out.println("Celcius: "+ g);
        
        sc.close();
    }
}
