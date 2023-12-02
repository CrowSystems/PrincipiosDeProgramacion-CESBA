package $10_EjerciciosFinales.CICLOS_C1.C1;

import java.util.Scanner;

/*
 * Imprimir los N primeros números naturales usando un bucle for.
 */
public class P60NnumerosNaturalesFor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n, i;
        
        System.out.println("***** N numeros naturales *****");
        System.out.println("Ingresa hasta que numero deseas visualizar: ");
        n = sc.nextInt();

        for(i=0;i<=n;i++){
            System.out.println(i+" es Natural");
        }
        sc.close();
        
    }
    
}
