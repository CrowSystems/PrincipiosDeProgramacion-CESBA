package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

/*
 * Calcular el área y el perímetro de un rectángulo.
 */
public class P12AreayPerimetrodeCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro;

        System.out.println("************ Area y perimetro de un rectangulo *************");

        System.out.println("Ingresa la base del rectangulo: ");
        base = sc.nextDouble();

        System.out.println("Ingresa la altura del rectangulo: ");
        altura = sc.nextDouble();

        area =  base * altura;
        perimetro = (2 * base) + (altura * 2);

        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);

        sc.close();
    }
}
