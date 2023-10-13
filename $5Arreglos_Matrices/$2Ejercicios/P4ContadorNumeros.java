package $5Arreglos_Matrices.$2Ejercicios;
/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Diseña un programa que cuente cuántas veces aparece un valor 
 * específico en un arreglo unidimensional de cadenas.
 */

import java.util.Scanner;

public class P4ContadorNumeros {
    public static void main(String[] args) {
        //Declaración de variables Scanner
        Scanner sc = new Scanner(System.in);
    
        //Variables simples
        int i, j=0, k, cont=0;

        System.out.println(("Cuantos valores deseas ingresar."));
        j = sc.nextInt();

        //Declaración de un arreglo
        int numeros[] = new int[j];

        for(i=0; i< j; i++){
            System.out.print("Ingresa valores para el arreglo: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Que numero deseas buscar: ");
        k = sc.nextInt();
    }
}
