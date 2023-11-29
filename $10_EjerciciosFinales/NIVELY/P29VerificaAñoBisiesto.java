package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Verificar si un año es bisiesto o no.
 */
public class P29VerificaAñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("***** Evaluación de año si es biciesto *****");
        
        System.out.println("Ingresar el año a evaluar: ");
        year = sc.nextInt();

        if((year %400 == 0) || ((year %4 == 0) && year %100 !=0)){
            System.out.println("El año: "+year+" es Bisiesto");
        } else {
            System.out.println("El año: "+year+" No es bisiesto");
        }
    }
}