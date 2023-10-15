/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Desarrolla un programa que tome una matriz bidimensional 
 * como entrada y devuelva su matriz transpuesta (filas se convierten en columnas y viceversa). 
 */
package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

public class P8MatrizTranspuesta {
    public static void main(String[] args) {
        //Declaración de la variable Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables simples
        int i, j, N=0,aux1;

        //Solicitud de datos y asignación del tamaño de arreglo
        System.out.print("Ingresa el tamaño para el arreglo: ");
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
        System.out.println(" ");
        System.out.println("Matriz transpuesta: ");
        //Busqueda del arreglo
        for(i=0;i<N;i++){
            System.out.println("");
            for(j=0;j<N;j++){
                System.out.print("["+arreglo[j][i]+"]");
            }
        }
        sc.close();
    }    
}
