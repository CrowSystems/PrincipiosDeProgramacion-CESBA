package $10_EjerciciosFinales.NIVELX;
//Verificar si un número es positivo, negativo o cero.

import java.util.Scanner;

public class P6NumeroPositivoNegativo {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        int num1;

        System.out.println("*******Numero Negativo, Numero positivo o Cero************");

        System.out.println("Ingresa el numero a evaluar: ");
        num1 = sc.nextInt();

        if(num1 == 0){
            System.out.println("El numero es Cero");
        } else if (num1 > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        sc.close();
    }
}
