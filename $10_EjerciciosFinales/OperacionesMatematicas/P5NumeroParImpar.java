package $10_EjerciciosFinales.OperacionesMatematicas;

import java.util.Scanner;

public class P5NumeroParImpar {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int num1;

        System.out.println("*******Numero Par o Ipar************");

        System.out.println("Ingresa el numero a evaluar: ");
        num1 = sc.nextInt();

        if(num1%2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        sc.close();
    }  
}
