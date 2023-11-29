package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P5NumeroParImpar {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int num1;

        System.out.println("*******Numero Par o Ipar************");

        System.out.println("Ingresa el numero a evaluar: ");
        num1 = sc.nextInt();
        
        //Condicion if se utiliza el % para obtener el modulo de 2
        if(num1%2 == 0){
            System.out.println("El numero es par");
            // en el caso que no cumpla la condición se realiza la sentencia else
        } else {
            System.out.println("El numero es impar");
        }
        sc.close();
    }  
}
