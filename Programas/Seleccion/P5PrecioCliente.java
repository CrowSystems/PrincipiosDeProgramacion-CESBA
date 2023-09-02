package Seleccion;
/*
 * Desarrolla un programa que calcule el precio final 
 * después de aplicar un descuento dependiendo del tipo 
 * de cliente (regular, premium, etc.).
 */

 import java.util.Scanner;

 public class P5PrecioCliente {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer Opcion;
        double monto=0, descuento=0;


        System.out.println("************Sistema de cobro***************");
        System.out.println("Ingresa el monto de tu compra.");
        monto = sc.nextDouble();
        System.out.println("Que tipo de cliente eres");
        System.out.println("1.- Regular");
        System.out.println("2.- Plus");
        System.out.println("3.- Premium");
        Opcion = sc.nextInt();

        switch (Opcion) {
            case 1:
                System.out.println("Seleccionaste Regular");
                System.out.println("No cuentas con algun descuento");
                System.out.println("El precio de tu compra es: " + monto);
            break;
            case 2:
                descuento = (monto * 0.05); 
                System.out.print("Seleccionaste PLUS");
                System.out.println("Tu descuento es de: "+descuento);
                monto = monto - descuento;
                System.out.println("El costo total de tu compra: "+monto);
            break;
            case 3:
                descuento = (monto * 0.10); 
                System.out.print("Seleccionaste Premium");
                System.out.println("Tu descuento es de: "+descuento);
                monto = monto - descuento;
                System.out.println("El costo total de tu compra: "+monto);
            break;
            default:
                System.out.println("La opción seleccionada no existe.");
            break;
        }
        sc.close();
    }
 }