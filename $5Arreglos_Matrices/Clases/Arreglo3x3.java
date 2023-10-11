package $5Arreglos_Matrices.Clases;

import java.util.Scanner;

public class Arreglo3x3 {

    public static void main(String[] args) {

        //Declaración de variable Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables simples
        int numeros[][] = new int[3][3];
        int i, j;

        System.out.println("Ingresa los elementos de arreglo bidimencional 3 x 3 ");

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Ingresa los valores: ");
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("El arreglo tridimencional ingresado: ");
        for(i=0;i<3;i++){
            System.out.println("");
            for(j=0;j<3;j++){
                System.out.print("["+numeros[i][j]+"]");
            }
        }
        sc.close();
    }    
}
