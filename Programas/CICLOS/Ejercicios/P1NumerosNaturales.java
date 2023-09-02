package CICLOS.Ejercicios;

import java.util.Scanner;

/*Imprimir los N primeros números naturales usando un bucle
* while.
*/

public class P1NumerosNaturales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Declaración de 
        int i=1,numero;

        System.out.print("Introduce la cantidad de numeros naturales");
        numero = sc.nextInt();

        while(numero >= i ){
            System.out.println("\n"+i);
            i++;
        }
        sc.close();
    }
}
