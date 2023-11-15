package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

public class P16AreayVolumenPrismaRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, area, volumen;

        System.out.println("Introduce el valor de la altura: ");
        a = sc.nextDouble();

        System.out.println("Introduce el valor de la base: ");
        b = sc.nextDouble();

        System.out.println("Introduce el valor de lo ancho: ");
        c = sc.nextDouble();

        volumen = (b * c) * a;
        area = 2*((b * c)+(b * a)+(a * c));
        
        System.out.println("El valor del área es: "+area);
        System.out.println("El valor del volumen es: "+volumen);       
    }    
}
