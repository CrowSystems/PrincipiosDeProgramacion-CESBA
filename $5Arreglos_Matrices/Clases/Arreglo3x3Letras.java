package $5Arreglos_Matrices.Clases;

import java.util.Scanner;

public class Arreglo3x3Letras {
    public static void main(String[] args) {
        //Declaracion de variable Scanner
        Scanner sc = new Scanner(System.in);

        //Declaración de variables simple y arreglos
        int numeros[][] = new int [3][3];
        int i, j;

        System.out.println("Ingresa los elementos de arreglo dibimencional 2 x 2: ");
        
        for(i=0; i < 2; i++) {
            for(j=0; j<2; j++){
                System.out.println("Ingresa el valor");
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("El arreglo bidimencional ingresado: ");
        for(i=0; i<2;i++){
            System.out.println(" ");
            for(j=0;j<2;j++){
                System.out.println("El Arreglo en la posición: "+"["+i+","+j+"] es: "+numeros[i][j]);
            }
        }
        sc.close();
    }
}