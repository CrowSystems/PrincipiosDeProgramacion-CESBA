package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Verificar si un número es primo.
 */
public class P22VerificaSiEsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, valor;

        System.out.println("******** Numero primo ********");
        
        System.out.println("Introduce el numero a evaluar mayor a 0 y entero: ");
        a = sc.nextInt();

        if(a == 1){
            System.out.println("No es primo");
        } else if(a % 2 != 0) {
            System.out.println("El numero " + a + " es primo");
        } else {
            System.out.println("No es primo");
        }
    } 
}
