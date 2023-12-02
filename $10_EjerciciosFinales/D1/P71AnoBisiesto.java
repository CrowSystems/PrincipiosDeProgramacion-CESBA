package $10_EjerciciosFinales.D1;

import java.util.Scanner;

/*
 * Verificar si un año es bisiesto o no.
 */
public class P71AnoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("***** Identifica año biciesto *****");
        System.out.println("Ingresa el año a evaluar: ");
        n = sc.nextInt();
        
        if ((n % 4 == 0) && ((n % 100 != 0) || (n % 400 == 0))){
	        System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
