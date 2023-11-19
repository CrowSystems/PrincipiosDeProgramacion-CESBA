package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Calcular el mínimo común múltiplo (MCM) de dos números enteros.
 */
public class P21CalcularMCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, mcm, i;

        System.out.println("********** Caluladora de Minimo común Múltiplo *********");

        System.out.println("Introduce el valor del primer numero: ");
        a = sc.nextInt();

        System.out.println("Introduce el valor del segundo numero: ");
        b = sc.nextInt();

        mcm = 1;
        i=2;
        while (i <= a || i <= b) {
            if(a%i == 0 || b%i ==0){
                mcm = mcm * i;

                if(a%i == 0) a=a/i;
                if(b%i == 0) b=b/i;
            } else i=i+1;   
        }
        System.out.println("El valor del MCM es de: " + mcm);
    }
}
