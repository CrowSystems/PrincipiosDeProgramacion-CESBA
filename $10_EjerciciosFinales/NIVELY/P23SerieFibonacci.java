package $10_EjerciciosFinales.NIVELY;

import java.util.Scanner;

/*
 * Generar los N primeros números de la secuencia de Fibonacci.
 */
public class P23SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serie, num1=0, num2=1, suma=1, i;

        System.out.println("Hatas que número deseas visualizar la serie de fibonacci: ");
        serie = sc.nextInt();
        
        System.out.println("La serie es la siguiente: ");
        System.out.println(num1);

        for(i = 1; i < serie; i++) {
            //Muestra la suma;
            System.out.println(suma);

            //Primero se suma el número inicial mas 1
            suma = num1 + num2;

            //Despues cambiamos la segunda variable por la primera
            num1 = num2;

            //Al final cambiamos el valor de la suma para el siguiente paso.
            num2 = suma;
        }
    }
}
