package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P15AreayVolumenCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado, area, volumen;

        System.out.println("************* Área y volumen de un cubo *****************");


        System.out.println("Introduce el valor de una de los lados: ");
        lado = sc.nextDouble();

        volumen = Math.pow(lado, 3);
        area = (6 * Math.pow(lado, 2));

        System.out.println("El área del cuadrado es: "+area);
        System.out.println("El volumen de un cuadrado: "+volumen);
    }
}
