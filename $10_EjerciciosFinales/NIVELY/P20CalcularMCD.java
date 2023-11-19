package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Calcular el máximo común divisor (MCD) de dos números enteros.
 */
public class P20CalcularMCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, valor;

        System.out.println("************ Maximo como un divisor de dos números *********");

        System.out.println("Introduce el primer número: ");
        a = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = sc.nextInt();

        while (b != 0) {
            valor = b;
            b = a % b;
            a = valor;
        }
        
        System.out.print("El maximo como un divisor es: "+a);
        sc.close();
    }
}
