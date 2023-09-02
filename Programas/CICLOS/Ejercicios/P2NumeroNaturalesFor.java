
/*Imprimir los N primeros números naturales usando un bucle
 *for 
*/
package CICLOS.Ejercicios;

import java.util.Scanner;

public class P2NumeroNaturalesFor {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);    

    //Declaración de variables
    int i, numero;

    System.out.println("Introduce cuantos numeros naturales deseas ver.");
    numero = sc.nextInt();

    for(i=1;i<=numero;i++)
    {
        System.out.println(i);
    }
    sc.close();
    }
}
