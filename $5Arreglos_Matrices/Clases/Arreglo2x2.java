package $5Arreglos_Matrices.Clases;

import java.util.Scanner;

public class Arreglo2x2 {

    public static void main(String[] args) {
        //Declaración de variable scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variable simple
        int numeros[][] = new int[2][2];
        int i,j;
        
        System.out.println("Ingresa los elementos de arreglo bidimencional 2 x 2");

        for(i=0; i<2; i++){
            for(j=0; j < 2; j++){
                System.out.println("Ingresa los valores: ");
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("Arreglo bidimencional ingresado: ");
        for(i=0; i<2; i++){
            System.out.println("");
            for(j=0; j<2; j++){
                System.out.println(numeros[i][j]);
            }
        }
        sc.close();
    }    
}
