package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P4DivisionDosNumeros {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int num1, num2, total;

        System.out.println("Ingresa el numero 1: ");
        num1 = sc.nextInt();

        System.out.println("Ingresa el numero 2: ");
        num2 = sc.nextInt();
        //División de dos variables
        total = num1 / num2;
        System.out.println("Resultado "+total);

        sc.close();
    }
    
}
