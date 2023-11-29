package $10_EjerciciosFinales.NIVELX;

import java.util.Scanner;

/*
 * Calcular el área y perímetro de un triángulo
 */
public class P10AreayPerimetrodeTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables de tipo double para incluir decimales en las variables
        double base, altura, area, perimetro;

        System.out.println("************** Area y Perimetro de un triangulo*************");

        System.out.print("Ingresa la base del triangulo: ");
        //Almacenamiento en la variable double        
        base = sc.nextDouble();

        System.out.print("Ingresa la altura del triangulo: ");
        altura = sc.nextDouble();
        //formula para obtener el area de un triangulo
    
        area = (base * altura ) / 2;
        perimetro = base * 3;

        System.out.print("El area del triangulo es: "+area);
        System.out.println("El perimetro del triangulo es: "+perimetro);
    }
    
}
