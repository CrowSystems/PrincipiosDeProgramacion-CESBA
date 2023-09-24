package CADENASCHAREQUALS.EJEMPLOS;

import java.util.Scanner;

public class P3CADENALENG {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaracion de variable.
        String cadena_original = "", cadena_substraccion = "";
        int num_caracteres=0, desde=0, hasta=0;

        System.out.print("Introduce la cadena de caracteres: ");
        cadena_original = sc.nextLine();
        num_caracteres = cadena_original.length();
        
        System.out.println("La cadena de caracteres"+cadena_original+" posee "+ num_caracteres+" caracteres");

        System.out.println("Desde que caracter deseas obtener la nueva cadena: ");
        desde = sc.nextInt();
        System.out.println("Hata que caracter deseas obtener la nueva adena ");
        hasta = sc.nextInt();
        
        cadena_substraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadenaes: " + cadena_substraccion);
    }
}
