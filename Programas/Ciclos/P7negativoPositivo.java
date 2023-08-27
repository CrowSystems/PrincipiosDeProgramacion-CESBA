package Ciclos;
/*
 * Escribe un programa que tome un número como entrada y muestre si 
 * es positivo, negativo o cero utilizando un switch case.
 */
import java.util.Scanner;

 public class P7negativoPositivo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero, Opcion;

        System.out.println("Introduce el numero a evaluar");
        numero = sc.nextInt();

        //Sentencia If que evaluar el numero si es negativo o positivo.
        if(numero == 0){
            Opcion = 1;
        } else if( numero > 0){
            Opcion = 2;
        } else {
            Opcion = 3;
        }
        
        switch (Opcion) {
            case 1:
                System.out.println("El número es cero");
            break;
            case 2:
                System.out.println("El número es Positivo");
            break;
            case 3:
                System.out.println("El número es Negativo");
            break;
        }
        sc.close();
    }
 }