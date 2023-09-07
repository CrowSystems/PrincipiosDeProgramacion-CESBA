package CICLOS.Ejercicios;
/*
 * Imprimir los N primeros números pares.
 */

import java.util.Scanner;

public class P3NumerosPares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);

        //Declaracion de variables.
        int numeros, i, j,contador=1;

        System.out.print("Cuantos numeros deseas imprimir: ");
        numeros = sc.nextInt();

        for(i=1; i <= numeros; i++)
        {
            
            if(contador % 2 != 0)
            { 
                System.out.println(contador);
            }
            contador++;
        }
        sc.close();
    }
}

