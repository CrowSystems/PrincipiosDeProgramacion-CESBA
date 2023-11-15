package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P18AreayVolumenPiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, volumen, altitud, base;

        System.out.println("******** Area y Volumen Piramide *********");

        System.out.println("Introduce el tamaño de la base: ");
        base = sc.nextDouble();

        System.out.println("Introduce la altitud de la piramide: ");
        altitud = sc.nextDouble();

        area = Math.pow(base, 2) + (2*(base))*altitud;
        volumen = (1/3*(Math.pow(base, 2))) * altitud;

        System.out.println("El area area de la piramide es: " +area);
        System.out.println("El volumen de la piramide es: " + volumen);

        sc.close();
    }
}
