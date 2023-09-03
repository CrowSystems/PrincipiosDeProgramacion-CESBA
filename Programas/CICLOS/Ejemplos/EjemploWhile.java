package CICLOS.Ejemplos;

import java.util.Scanner;

public class EjemploWhile{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int numero;
        numero =sc.nextInt();

        while(numero <= 500) {
            System.out.println("Ingresa un numero");
            numero = sc.nextInt();
        }
    }
}