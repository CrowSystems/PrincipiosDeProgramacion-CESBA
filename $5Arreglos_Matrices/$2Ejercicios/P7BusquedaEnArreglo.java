/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Escribe un programa que busque un valor específico en una matriz 
 * bidimensional y muestre su posición (fila y columna) si se encuentra.
 * 
 */
package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

public class P7BusquedaEnArreglo {
    public static void main(String[] args) {
        //Declaración de la variable Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables simples
        int i, j, N=0, busqueda=0, aux1=0, aux2=0;

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

        System.out.print("Que valor desea buscar en el arreglo: ");
        busqueda = sc.nextInt();
        //Busqueda del arreglo
        for(i=0; i < arreglo.length; i++){
            for(j=0;j < arreglo.length; j++){
                if(arreglo[i][j] == busqueda){
                    aux1 = i;
                    aux2 = j;
                    break;//al encontrar el valor se sale del programa ()
                }
            }
        } 
        System.out.print("El el valor: "+busqueda+"fuen encontrado en la posición: ["+aux1+"] ["+aux2+"]");
        sc.close();
    }
    
}