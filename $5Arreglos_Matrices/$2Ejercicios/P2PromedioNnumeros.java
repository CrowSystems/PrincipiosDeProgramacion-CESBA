package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;

/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Desarrolla un programa que calcule el promedio de los valores en un arreglo unidimensional de números decimales. 
 */
public class P2PromedioNnumeros {
    public static void main(String[] args) {
        //Declaración de variables Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int i,j=0;
        float promedio=0;

        System.out.print("Cuantos valores deseas introducir: ");
        j = sc.nextInt();

        //Declaración de arreglo
        int numeros[] = new int[j];
        
        for(i=0; i<j;i++){
            System.out.print("Ingresa el valor para "+i+" ");
            numeros[i] = sc.nextInt();
            promedio = promedio + numeros[i];
        }
        promedio=promedio / j;
        System.out.println("Tu promedio es: "+promedio);
    }
    
}
