package CADENASCHAREQUALS.EJEMPLOS;

import java.util.Scanner;

public class P5NVALORESENARREGLO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Declaraccion de variables:
        int n,i;

        System.out.println("Ingresala cantidad de numeros a mostrar:");
        n = sc.nextInt();

        int numeros[] = new int[n];

        for(i=0; i< n; i++){
            System.out.println("ingresa el valor "+i+"de tu arreglo: ");
            numeros[i] = sc.nextInt();
        }

        //IMPRIMIR EL ARREGLO:
        System.out.println("El valor de tu arreglo es: ");
        for(i=0;i<n;i++){
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
