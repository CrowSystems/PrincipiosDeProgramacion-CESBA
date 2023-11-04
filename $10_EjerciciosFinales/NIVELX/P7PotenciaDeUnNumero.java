package $10_EjerciciosFinales.OperacionesMatematicas;
//Calcular la potencia de un número (base^exponente).
import java.util.Scanner;

public class P7PotenciaDeUnNumero {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double num1, num2;

        System.out.println("*******Potencia de un Número************");

        System.out.println("Ingresa la base: ");
        num1 = sc.nextDouble();

        System.out.println("Ingresa el exponente a elevar: ");
        num2 = sc.nextDouble();

        num1 = Math.pow(num1, num2);

        System.out.println("El resultado es: "+num1);

        sc.close();
    }
}