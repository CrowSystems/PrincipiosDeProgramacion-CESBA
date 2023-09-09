package CICLOS.Ejercicios;

import java.util.Scanner;

public class P4NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        int i, N, opcion=1;
        do {
            System.out.println("Ingresa el valor de N: ");
            N = sc.nextInt();

            for(i=1; i <=N; i++){
                if(i%2 !=0){
                    System.out.println(i);
                }
            }
            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
        }while(opcion != 0);
        sc.close();
    }
}
