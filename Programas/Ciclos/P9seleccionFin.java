package Ciclos;
/*
 * Desarrolla un programa que permita al usuario elegir una actividad para hacer 
 * durante el fin de semana (por ejemplo: ir al cine, hacer senderismo, leer) 
 * utilizando un switch case.
 */

import java.util.Scanner;

 public class P9seleccionFin {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Integer Opcion;

        System.out.println("Opciones para el fin de semana");
        System.out.println("1.- Ir al Cine");
        System.out.println("2.- Hacer senederismo.");
        System.out.println("3.- Leer");
        System.out.println("Que deseas realizar");
        Opcion = sc.nextInt();
        
        switch (Opcion) {
            case 1:
                System.out.println("Seleccionaste ir al Cine");
                System.out.println("Que disfrures la pelicula");    
            break;
            case 2:
                System.out.println("Seleccionaste hacer senderismo");
                System.out.println("Que la pases muy bien");    
            break;
            case 3:
                System.out.println("Seleccionaste Leer");
                System.out.println("Que disfrutes la lectura");    
            break;
        
            default:
                System.out.println("Opcion no valida.");    
            break;
        }
        sc.close();
    }
 }