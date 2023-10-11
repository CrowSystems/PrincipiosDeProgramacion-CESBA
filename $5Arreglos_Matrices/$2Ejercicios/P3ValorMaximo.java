package $5Arreglos_Matrices.$2Ejercicios;

import java.util.Scanner;
/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Escribe un programa que encuentre y muestre el valor máximo en un arreglo unidimensional de enteros.
 */
public class P3ValorMaximo {
    public static void main(String[] args) {
        //Declaración de variables Scanner
        Scanner sc = new Scanner(System.in);

        //Variables simples
        int i, j=0, mayor=0;

        System.out.print("Ingresa cuantos valores deseas introducir al arreglo: ");
        j = sc.nextInt();

        //Declaración de arreglo
        int numeros[] = new int[j];
        
        for(i=0; i < j; i++){
            System.out.print("Ingresa el valor para "+i+" ");
            numeros[i] = sc.nextInt();
        }
        for(i=0;i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: "+mayor);
    }
}