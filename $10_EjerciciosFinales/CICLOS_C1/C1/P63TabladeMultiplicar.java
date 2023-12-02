package $10_EjerciciosFinales.CICLOS_C1.C1;

import java.util.Scanner;
/*
 * Imprimir la tabla de multiplicar de un número dado.
 */
public class P63TabladeMultiplicar {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,i,res;

      System.out.println("***** Tablas de multiplicar *****");

      System.out.println("Ingresa la tabla a multiplicar: ");
      n =sc.nextInt();
      System.out.println("TABLA DEL NÚMERO "+n);
      for(i=1; i <= 10; i++){
         res = n * i;
         System.out.println(n+" x "+i+" = "+res);
      }
   }
}