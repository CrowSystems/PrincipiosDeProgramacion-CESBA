package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Convertir grados Celsius a grados Fahrenheit.
 */
public class P25GradosCaF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g, f;

        System.out.println("************** Conversión de grados Celsius a grados Fahrenheit *************");
        
        System.out.println("Introduce los grados a convertir");
        g = sc.nextDouble();

        f = (g*(1.8))+32; 

        System.out.println("Celcius: "+g);
        System.out.println("Fahrenheit: "+f);

        sc.close();
    }
}
