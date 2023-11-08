package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P9PerimetrodeunTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, perimetro;

        System.out.println("**************PERIMETRO DE UN TRIANGULO*******************");

        System.out.println("Ingresa uno de los lados del triangulo: ");
        num1 = sc.nextDouble();

        perimetro = 3*num1;

        System.out.println("El perimetro de tu triangulo es de: "+perimetro);

        sc.close();
    }
}
