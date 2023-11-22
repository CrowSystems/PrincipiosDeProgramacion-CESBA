package $10_EjerciciosFinales.NIVELW1;

import java.util.Scanner;

/*
 * Concatenar dos cadenas.
 */
public class P47ConcatenarCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;

        System.out.println("************ Concatenar en cadena de caracteres ***********");

        System.out.println("Introduce la primera cadena de caracteres: ");
        a = sc.nextLine();

        System.out.println("Introduce la segunda cadena de caracteres: ");
        b = sc.nextLine();

        System.out.println("La cadena queda de la siguiente manera: ");
        System.out.println(a+" "+b);

        sc.close();
    }
    
}
