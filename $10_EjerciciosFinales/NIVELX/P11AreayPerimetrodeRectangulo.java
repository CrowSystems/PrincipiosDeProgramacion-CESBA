package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

/*
 * Calcular el área y el perímetro de un cuadrado.
 */
public class P11AreayPerimetrodeRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, area, perimetro;

        System.out.println("************* Area y perimetro de un cuadrado *************");

        System.out.println("Ingresa el valor de uno de los lados: ");
        num1 = sc.nextDouble();

        area = Math.pow(num1, 2);
        perimetro = 4 * num1;

        System.out.println("El area del cuadrado es: "+area);
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
    
}
