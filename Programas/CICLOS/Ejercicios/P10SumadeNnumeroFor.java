package CICLOS.Ejercicios;

import java.util.Scanner;

public class P10SumadeNnumeroFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int i, N, suma=0,opcion=1;

        do {
            System.out.print("Ingresa el valor de N");
            N = sc.nextInt();
            
            //Cicle for, almacena la suma que se va incrementando.
            for(i=1; i <= N; i++) 
            {
                suma = suma + i;
                //System.out.println(i +" -- "+ suma);
            }

            //Resultado Final
            System.out.println("La suma de los numeros es: " + suma);

            //Cliclo de nueva selección.
            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
            
        } while(opcion != 0);
        sc.close();
    }
}
