package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Calcular la distancia entre dos puntos en un plano cartesiano.
 */
public class P27CarcularDistancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        double aux, valor;

        System.out.println("***** Calculo de la distancia entre dos puntos *****");
        System.out.println("Introduce el valor del punto para x1: ");
        x1 = sc.nextInt();
        System.out.println("Introduce el valor del punto para y1: ");
        y1 = sc.nextInt();
        System.out.println("Introduce el valor del punto para x2: ");
        x2 = sc.nextInt();
        System.out.println("Introduce el valor del punto para y2: ");
        y2 = sc.nextInt();

        valor = x1 -x2;
        aux = y1 - y2;

        valor = Math.sqrt(Math.pow(valor, 2) + Math.pow(aux, 2));

        System.out.println("La distancia entre dos puntos es: "+valor);

        sc.close();
    }    
}
