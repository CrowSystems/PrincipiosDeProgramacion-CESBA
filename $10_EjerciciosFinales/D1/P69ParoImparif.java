package $10_EjerciciosFinales.D1;
/*
 * Verificar si un número es par o impar usando if-else.
 */

import java.util.Scanner;
public class P69ParoImparif {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("***** Numero par o impar *****");

    System.out.println("Ingresa el numero a evaluar: ");
    n = sc.nextInt();

    if(n%2 == 0){
        System.out.println(n+" es un numero par");
    } else{
        System.out.println(n + " es Impar");
    }
    sc.close();
    }
}
