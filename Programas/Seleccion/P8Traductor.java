    package Seleccion;
/*
 * Crea un traductor simple que convierta palabras 
 * básicas de inglés a español utilizando un switch case.
 */
import java.util.Scanner;

 public class P8Traductor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String Opcion;

        System.out.println("Introduce la Palabra a traducir");
        System.out.println("Por Favor");
        System.out.println("Gracias");
        System.out.println("Nombre");
        System.out.println("Y");
        System.out.println("Nuevo");
        System.out.println("Cual");
        System.out.println("\nSelecciona una Opcion");        
        Opcion = sc.nextLine();
        

        switch (Opcion) {
            case "Nuevo":
                System.out.println("New");
            break;
            case "Por Favor":
                System.out.println("Please");
            break;
            case "Gracias":
                System.out.println("Thank you");
            break;
            case "Nombre":
                System.out.println("Name");
            break;
            case "Y":
                System.out.println("And");
            break;
            case "Cual":
                System.out.println("Which");
            break;
            default:
                System.out.println("La palabra no se encuentra en el catalogo");
                break;
        }

        sc.close();
    }
 }