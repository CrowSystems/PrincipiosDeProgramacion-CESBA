package CICLOS.Ejercicios;

import java.util.Scanner;

public class P9SumadeNnumerosWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variable de selección
        int opcion=1;

        do{
            int i = 1, N, suma=0;
            System.out.print("Ingresa el valor de N: ");
            N = sc.nextInt();

            //Ciclo While
            while(i <= N) {
                suma = suma + i;
                i++;
            }
            System.out.println("La suma de los primeros "+ N + " es: "+suma);

            //Ciclo do While de selección.
            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
        } while(opcion != 0);
        sc.close();
    }
}
