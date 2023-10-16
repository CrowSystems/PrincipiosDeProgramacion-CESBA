/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Implementa un algoritmo de ordenación 
 * (por ejemplo, ordenación de burbuja o ordenación rápida) 
 * para ordenar una matriz bidimensional en función de una columna específica. 
 * El usuario debe elegir la columna por la que se ordenará.
 * 
*/
package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

public class P10MatrizOrdena {
    public static void main(String[] args) {
        //Declaración de variable de solicitud de datos.
        Scanner sc=new Scanner(System.in);

        //Declaración de variables simples
        int i,j, N=0, columna=0;


        System.out.println("Ingresa el tamaño de tu arreglo: ");
        N = sc.nextInt();
        //Delcaración de arreglo
        int arreglo1[][] = new int[N][N];

        //Arrgelo 1
        System.out.println("Ingresa los valores para la matriz 1: ");
        for(i=0; i<N;i++){
            System.out.print("");
            for(j=0; j<N; j++){
                System.out.print("Valor:  ");
                arreglo1[i][j] = sc.nextInt(); 
            }
        }
        //Impresión de arreglo
        for(i=0; i<N;i++){
            System.out.println("");
            for(j=0; j<N; j++){
                System.out.print("["+arreglo1[i][j]+"]");
            }
        }

        //Ordena el arreglo
        System.out.println("Ingre el numero de la columna que desea ordenar: ");
    }
}
