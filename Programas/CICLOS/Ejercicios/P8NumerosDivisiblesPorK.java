package CICLOS.Ejercicios;

import java.util.Scanner;

public class P8NumerosDivisiblesPorK {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Declaracion de variables.
        int i,opcion=1,N,K;

        //Ciclo de repetición de programa
        do {
            System.out.println("Sistema de suma de numeros divisibles por otro numero");
            
            System.out.println("Ingresa el valor de N: ");
            N = sc.nextInt();

            System.out.println("Ingresa el valor de K: ");
            K = sc.nextInt();
            System.out.print("Los numeros divisibles de "+N+" entre "+K);
            
            for(i=1;i<=N;i++){
                if(i%K == 0){
                    System.out.println(i + " ");
                }
            }
            
            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
        }while(opcion !=0);
        sc.close();
    }
    
}
