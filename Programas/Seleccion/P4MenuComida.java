package Seleccion;
/*
 * Crea un menú de opciones de comida 
 * (por ejemplo: hamburguesa, pizza, ensalada) utilizando 
 * un switch case y muestra un mensaje según la selección 
 * del usuario.
 */

import java.util.Scanner;

public class P4MenuComida {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer Opcion;
    
        System.out.println("****************Menu de Comida**************");
        System.out.println("1.- Hamburguesa");
        System.out.println("2.- Pizza");
        System.out.println("3.- Ensalada");
        
        System.out.println("Selecciona una opción: ");
        Opcion = sc.nextInt();

        switch(Opcion) {
            case 1:
                System.out.println("Seleccionaste Hamburguesa");
            break;
            case 2:
                System.out.println("Seleccionaste Pizza");
            break;
            case 3:
                System.out.println("Seleccionaste Ensalada");
            break;
            default:
                System.out.println("La opción seleccionada no existe.");
            break;
        }
        sc.close();
    }

}
