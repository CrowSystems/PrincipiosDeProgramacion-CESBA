import java.util.Scanner;

public class PREMISA2 {
    /*
    * Premisa 2: calcular el precio total de una compra aplicando 
    * un descuento si el monto supera cierta cantidad
    */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double precio=0, descuento=0, total=0;
        
        System.out.println("Ingresa el total de la compra: ");
        precio = sc.nextDouble();

        if(precio >= 100 && precio <= 200)
        {
            descuento = (precio * 0.05);        
        } else if(precio >= 201 && precio <= 500) {
            descuento = (precio * 0.10);
        } else if(precio >= 501){
            descuento = (precio * 0.15);
        } else {
            System.out.println("Ingresa una cantidad valida");
        }
        total = precio - descuento;
        System.out.println("El costo de tu compra es: " + total);
        sc.close();

    }
}