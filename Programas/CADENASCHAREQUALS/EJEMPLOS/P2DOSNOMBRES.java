package CADENASCHAREQUALS.EJEMPLOS;

import java.util.Scanner;

public class P2DOSNOMBRES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre_uno = "", nombre_dos = "";

        System.out.println("Ingresa el primer nombre");
        nombre_uno = sc.nextLine();

        System.out.println("Ingresa el primer nombre");
        nombre_dos = sc.nextLine();

        if(nombre_uno.equalsIgnoreCase(nombre_dos)){
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }
        sc.close();
    }
}
