package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P19NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i;

        do {
            System.out.print("Introduce un valor mayor a 0 a evaluar: ");
            a = sc.nextInt();  
        }while(a <= 0);

        if(a == 1) {
            System.out.println("No es primo");
        } else {
            i = 2;
            while (a % i != 0) {
                i++;
            }
            if(i == a){
                System.out.println("Es Primo");
            } else {
                System.out.println("No es primo");
            }
        }
        sc.close();
    }
}