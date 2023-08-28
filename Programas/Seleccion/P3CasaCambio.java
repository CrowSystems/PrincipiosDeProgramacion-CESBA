package Ciclos;
/*
 * Escribe un programa que convierta una cantidad de dólares 
 * a euros o viceversa, dependiendo de la selección del 
 * usuario.
 */

 import java.util.Scanner;

 public class P3CasaCambio {
     public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);

      Integer Opcion;
      double Convercion = 0, cantidad=0;

      System.out.println("Casa de cambio");
      System.out.println("Que moneda desea convertir");
      System.out.println("Opciones");
      System.out.println("1.- Dolares");
      System.out.println("2.- Euros");
      Opcion = sc.nextInt();

      switch(Opcion) {
         case 1:
            System.out.println("Dolares --> Euros");
            System.out.println("Ingresa la cantidad a convertir: ");
            cantidad = sc.nextFloat();
            Convercion = (cantidad * 0.93);
            System.out.print("Tus divisas son de: " + Convercion);
         break;
         case 2:
            System.out.println("Euros --> Dolares");
            System.out.println("Ingresa la cantidad a convertir: ");
            cantidad = sc.nextFloat();
            Convercion = (cantidad * 1.08);
            System.out.print("Tus divisas son de: " + Convercion);
         break;
         default:
         System.out.println("No existe la Opción seleccionada.");
      }
      sc.close();
   }
}