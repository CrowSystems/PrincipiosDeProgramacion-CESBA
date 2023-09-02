package CICLOS;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args){

        int numero;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Ingresa un numero");
            numero = sc.nextInt();
        } while(numero <= 500);
    }
}
