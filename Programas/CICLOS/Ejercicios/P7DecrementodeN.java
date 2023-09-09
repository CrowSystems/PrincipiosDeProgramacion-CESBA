package CICLOS.Ejercicios;

import java.util.Scanner;

public class P7DecrementodeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaracion de variables
        int i, N, opcion=1;

        //Ciclo de repetición
        do {
            System.out.print("Ingresa el valor de N para realizr la serie: ");
            N = sc.nextInt();

            //Ciclo de decremento
            for(i=N; i>=0; i--){
                System.out.println(i);
            }


            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
        } while(opcion !=0);
        sc.close();
    }
    
}
