package Ciclos;
/*
 * Crea un programa que tome una calificación numérica del 1 al 10 
 * y devuelva un mensaje de calificación (insuficiente, suficiente, 
 * bueno, excelente) utilizando un switch case.
 */

import java.util.Scanner;

 public class P10evaluacion {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float calificacion;
        Integer Opcion;

        System.out.println("******* Sistema de calificaciones *******");
        System.out.println("Ingresa tu calificacion");
        calificacion = sc.nextFloat();

        if(calificacion<=5){
            Opcion = 1;
        } else if(calificacion == 6) {
            Opcion = 2;
        } else if(calificacion>=7 && calificacion <=9){
            Opcion = 3;
        } else if(calificacion==10){
            Opcion = 4;
        } else {
            Opcion = 5;
        }

        switch (Opcion) {
            case 1:
                System.out.println("Tu calificación es de: "+calificacion+" insuficiente");
            break;
            case 2:
                System.out.println("Tu calificación es de: "+calificacion+" suficiente");
            break;
            case 3:
                System.out.println("Tu calificación es de: "+calificacion+" Bueno");
            break;
            case 4:
                System.out.println("Tu calificación es de: "+calificacion+" ¡EXCELENTE!");
            break;
            case 5:
                System.out.println("Calificación no valida");
            break;
        }


    }
 }