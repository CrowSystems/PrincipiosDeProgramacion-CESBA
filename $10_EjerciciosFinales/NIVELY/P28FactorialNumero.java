package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Calcular el factorial de un número entero.
 */
public class P28FactorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, factorial=1;

        System.out.println("***** Factorial de un número entero");

        System.out.println("Introduce el numero a calcular: ");
        a = sc.nextInt();

        for(i = 1; i <= a; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de "+a+" es: "+factorial);

        sc.close();

    }
    
}
