package Ciclos;
/*
 * 
 * Crea un programa que permita al usuario seleccionar una forma 
 * geométrica (círculo, cuadrado, triángulo) y calcule el área 
 * de la misma.
 */

 import java.util.Scanner;

 public class P6areaFiguras {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer Opcion;
        double base=0, altura=0, area = 0, radio=0;

        System.out.println("Calculo de área de figuras");
        System.out.println("1.- Circulo");
        System.out.println("2.- Cuadrado");
        System.out.println("3.- Triangulo");
        System.out.println("Seleeciona una opción: ");
        Opcion = sc.nextInt();

        switch (Opcion) {
            case 1:
                System.out.println("*******Calculo del área de un circulo******");
                System.out.println("Introduce el valor del radio:");
                radio = sc.nextDouble();
                area = Math.PI * Math.pow(radio,2);
                System.out.println("El valor del área es de: "+ area);
            break;
            case 2:
                System.out.println("*******Calculo del área de un Cuadrado*****");
                System.out.println("Introduce el valor de uno de los lados del cuadrado:");
                altura = sc.nextDouble();
                area = altura * altura;
                System.out.println("El valor del área es de: "+ area);
            break;
            case 3:
                System.out.println("*******Calculo del área de un Triangulo******");
                System.out.println("Introduce el valor de la altura:");
                altura = sc.nextDouble();
                System.out.println("Introduce el valor de la base:");
                base = sc.nextDouble();
                area = (base * altura)/2;
                System.out.println("El valor del área es de: "+area);
            break;
            default:
                System.out.println("Opción no valida");
            break;
        }
        sc.close();
    }
 }