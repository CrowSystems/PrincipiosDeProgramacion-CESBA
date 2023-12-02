package $10_EjerciciosFinales.CICLOS_C1.C1;

import java.util.Scanner;

/*
 * Imprimir los N primeros números naturales usando un bucle while.
 */
public class P59NnumerosWhiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=1;
        
        System.out.println("***** N numeros naturales *****");
        System.out.println("Ingresa hasta que numero deseas visualizar: ");
        n = sc.nextInt();

        while (i<n) {
            System.out.println(i+" es natural");
            i++;
        }
        sc.close();
    }
}
