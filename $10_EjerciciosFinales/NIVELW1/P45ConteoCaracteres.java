package $10_EjerciciosFinales.NIVELW1;

import java.util.Scanner;

/*
 * Contar la cantidad de caracteres en una cadena.
 */
public class P45ConteoCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        System.out.println("***** Conteo de caracteres dos lineas de caracteres *****");

        System.out.println("Introduce la frace para el conteo: ");
        a = sc.nextLine();

        int contador = a.length();

        System.out.println("La frace contiene: "+ contador +" Caracteres");
        sc.nextLine();
    }
}
