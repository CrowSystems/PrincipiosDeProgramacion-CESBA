package $10_EjerciciosFinales.OperacionesMatematicas;

import java.util.Scanner;

public class P3MultiplicaciónDosNumeros {
        public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int num1, num2, total;

        System.out.println("Ingresa el numero 1: ");
        num1 = sc.nextInt();

        System.out.println("Ingresa el numero 2: ");
        num2 = sc.nextInt();

        total = num1 * num2;
        System.out.println("Resultado "+total);

        sc.close();
    }
    
}
