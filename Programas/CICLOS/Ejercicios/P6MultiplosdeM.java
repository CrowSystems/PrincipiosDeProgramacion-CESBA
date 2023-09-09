package CICLOS.Ejercicios;

import java.util.Scanner;

public class P6MultiplosdeM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N, M, opcion=1;

        do{
            System.out.println("Ingresa el valor de N");
            N = sc.nextInt();

            System.out.println("ingresa el valor de M");
            M = sc.nextInt();


            for(i =1; i <= N; i++){
                if(i % M == 0){
                    System.out.println(i);
                }
            }
            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
        } while(opcion != 0);
        sc.close();
    }
}
