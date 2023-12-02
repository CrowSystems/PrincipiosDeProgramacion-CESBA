package $10_EjerciciosFinales.D1;

import java.util.Scanner;

/*
 * Verificar si un número es positivo, negativo o cero usando if-else.
 */
public class P70PositivoNegativoif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("***** Numero negativo o positivo *****");
        System.out.println("Ingresa el numero a evaluar: ");
        n = sc.nextInt();

        if(n == 0){
            System.out.println("Es cero");
        } else if(n>0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es Negativo");
        }
        sc.close();
    }
}