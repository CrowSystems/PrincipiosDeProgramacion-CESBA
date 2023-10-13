/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Implementa un programa que sume dos matrices 
 * bidimensionales y muestre el resultado.
 * 
 */
package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

public class P6SumaMatrices {
    public static void main(String[] args) {
        //Declaración de la variable Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables simples
        int i, j, N=0, sum=0;

        //Solicitud de datos y asignación del tamaño de arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        N = sc.nextInt();

        //Declaración de areglo
        int arreglo[][] = new int[N][N];

        //Ingresar valores al arregloo.
        for(i=0; i < N; i++){
            for(j=0; j < N; j++){
                System.out.print("Ingresa el valor del arreglo ");
                arreglo[i][j] = sc.nextInt();
            }
        }

        //Impresión del arreglo
        System.out.println("El arreglo Bidimencional ingresado: ");
        for(i=0; i < arreglo.length; i++){
            for(j=0;j < arreglo.length; j++){
                sum+=arreglo[i][j];
            }
        }
        System.out.println("La suma del arreglo es: " + sum);
        sc.close();
    }
}
