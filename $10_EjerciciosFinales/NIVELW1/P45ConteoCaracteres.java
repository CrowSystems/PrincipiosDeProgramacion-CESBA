package $10_EjerciciosFinales.NIVELW1;

import java.util.Scanner;

/*
 * Contar la cantidad de caracteres en una cadena.
 */
public class P45ConteoCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;

        System.out.println("***** Concaten dos lineas de caracteres *****");

        System.out.println("Introduce el primer caracter: ");
        a = sc.nextLine();

        System.out.println("Introduce el segundo caracter: ");
        b = sc.nextLine();

        System.out.println("Las lineas de caracteres quedan de la siguiente manera: ");
        System.out.println(a + " " +b);

        sc.nextLine();
    }
}
