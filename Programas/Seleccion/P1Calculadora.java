package Ciclos;
/*
 * Crea una calculadora simple que tome dos números y un operador (+, -, *, /) 
 * como entrada y muestre el resultado.
 */

//Impotación de libreria
import java.util.Scanner;
 
public class P1Calculadora {

    public static void main(String[] args){
        
        //creación de objero scaner para almacenamiento de de variables
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        Integer Operacion;
        float num1 = 0, num2 = 0, res=0;

        //Inicio de programa
        System.out.println("********** Calculadora **********");
        System.out.println("Ingresa el numero 1");
        num1 = sc.nextFloat();
        System.out.println("Ingresa el numero 2");
        num2 = sc.nextFloat();
        System.out.println("Selecciona la operacion a realizar 1.-, 2.+, 3.*, 4./");
        Operacion = sc.nextInt();

        switch (Operacion) {
            case 1:
                res = num1 - num2;
                System.out.println("La resta es: " + res);
            break;
            case 2:
                res = num1 + num2;
                System.out.println("La resta es: " + res);
            break;
            case 3:
                res = num1 * num2;
                System.out.println("La resta es: " + res);
            break;
            case 4:
                res = num1 + num2;
                System.out.println("La resta es: " + res);
            break;
            default:
            System.out.println("No existe la Opción");
                break;
        }
            sc.close();
    }
}