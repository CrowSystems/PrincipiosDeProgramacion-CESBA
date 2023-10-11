package $5Arreglos_Matrices.$2Ejercicios;
/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Grupo: 2A
 * Principios de programación
 * 
 * Crea un programa que calcule la suma de todos los elementos en un arreglo unidimensional de enteros. 
 */
import java.util.Scanner;

public class P1SumaElementos {
    public static void main(String[] args) {
        //Declaración de variables Scanner
        Scanner sc = new Scanner(System.in);


        //Variables simples
        int i, j=0, sum=0;

        System.out.println("Ingresa cuantos valores deseas introducir: ");
        j = sc.nextInt();

        //Declaración de arreglo
        int numeros[] = new int[j];
        
        for(i=0; i<j;i++){
            System.out.print("Ingresa el valor para "+i+" ");
            numeros[i] = sc.nextInt();
            sum+=numeros[i];
        }
        System.out.println("La suma es de "+sum);
    }
}
