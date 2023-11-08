package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P8AreaCirculo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double num1, area;

        System.out.println("*************** Area de un circulo ****************");

        System.out.println("Ingresa el tamaño del radio: ");
        num1 = sc.nextDouble();

        area = Math.PI * Math.pow(num1,2);

        System.out.println("El are del circulo es: " +  area);
        sc.close();
    }  
}
