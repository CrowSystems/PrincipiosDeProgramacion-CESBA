/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Crea una función que multiplique dos matrices bidimensionales y devuelva el resultado. 
 * Asegúrate de que las dimensiones sean adecuadas para la multiplicación. 
*/
package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

public class P9MultiplicacionMatrices{
    public static void main(String[] args) {
        //Declaración de variable de solicitud de datos.
        Scanner sc=new Scanner(System.in);

        //Declaración de variables simples
        int i,j, N=0;


        System.out.println("Ingresa el tamaño de tu arreglo: ");
        N = sc.nextInt();
        //Delcaración de arreglo
        int arreglo1[][] = new int[N][N];
        int arreglo2[][] = new int[N][N];
        int arreglo3[][] = new int[N][N];

        //Arrgelo 1
        for(i=0; i<N;i++){
            for(j=0; j<N; j++){
                System.out.print("Ingresa los valores para la matriz 1: ");
                arreglo1[i][j] = sc.nextInt(); 
            }
        }

        //Arreglo 2
        for(i=0; i<N; i++){
            for(j=0; j< N; j++){
                System.out.print("Ingresa los valores para el arreglo 2: ");
                arreglo2[i][j] = sc.nextInt();
            }
        }

        System.out.print("El sesultado de la multiplicación de los arreglos, ");
        for(i=0; i<N; i++){
            System.out.println("   ");
            for(j=0; j<N; j++){
                arreglo3[i][j] = arreglo1[i][j] * arreglo2[i][j];
                System.out.print("["+arreglo3[i][j]+"]");
            }
        }
    }
}