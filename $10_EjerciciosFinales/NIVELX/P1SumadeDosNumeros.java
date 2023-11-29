package $10_EjerciciosFinales.NIVELX;
//Se importa las librerias Scanner para utilizar 
import java.util.Scanner;

public class P1SumadeDosNumeros {
    public static void main(String[] args) {
        //Se inicializa la variable scanner para que el usuario ingrese información al programa
        Scanner sc =  new Scanner(System.in);
        //Se inicializan las variables de tipo int para ingresar enteros para la suma.
        int num1, num2, total;
        //Solicitud de información al usuario
        System.out.println("Ingresa el numero 1: ");
        //Almacenamiento en la variable
        num1 = sc.nextInt();

        System.out.println("Ingresa el numero 2: ");
        num2 = sc.nextInt();
        //suma de variables
        total = num1 + num2;
        //Imprime el resultado
        System.out.println("Resultado "+total);
        //termina el proceso ciclo de registro
        sc.close();
    }
}
