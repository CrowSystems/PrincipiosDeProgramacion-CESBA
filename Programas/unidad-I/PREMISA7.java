import java.util.Scanner;

public class PREMISA7 {
    /*Calcular el costo de un boleto de cine segun la edad del espectador
     * aplicando diferentes tarifas para niños, adultos, y personas mayores
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduce la edad el espectador: ");
        edad = sc.nextInt();

        if(edad >= 3 && edad <= 14) {
            System.out.println("El costo de l boleto es 35 pesos");
        } else if (edad >=15 && edad <=60) {
            System.out.println("El costo de l boleto es 80 pesos");
        } else if(edad >= 61){
            System.out.println("El costo de l boleto es 50 pesos");
        } else {
            System.out.println("Introduce un valor valido");
        }
        sc.close();
    }
}