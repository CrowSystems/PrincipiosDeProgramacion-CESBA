package $10_EjerciciosFinales.CICLOS_C1.C1;

import java.util.Scanner;

/*
 * Imprimir los N primeros números impares.
 */
public class P62NnumeroImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.println("***** Numeros impares. *****");
        System.out.println("Ingresa hasta que nuemero deseas visualizar: ");
        n = sc.nextInt();
        
        System.out.println("Los numeros impares son: ");
        for(i=0; i<=n; i++){
            if(i%2!=0){
                System.out.println(i + " es impar");
            }
        }
        sc.close();
    }
}
