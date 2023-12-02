package $10_EjerciciosFinales.D1;

import java.util.Scanner;

/*
 * Verificar si un número es primo usando un bucle while.
 */
public class P72NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        do {
            System.out.print("Introduce un numero >0: ");
            n = sc.nextInt();
        } while (n <= 0);
		
        if (n == 1) {
            System.out.println("No es primo");
        } else {
            i = 2;   
            while (n % i != 0) {                           
                i++;
            }
            if (i == n) {
                System.out.println("Primo");        
            } else {
                System.out.println("No es primo");  
            }
        }
    }
}
