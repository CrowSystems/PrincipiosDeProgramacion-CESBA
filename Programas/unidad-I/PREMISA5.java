//Importación de la libreria Scanner esta libreria nos permite leer datos introducidos en el sistema.
import java.util.Scanner;

public class PREMISA5 {
    /*Crea un programa que clasifique un número ingresado por el usuario
     *como par o impar
     * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Ingresa el numero a evaluar: ");
        numero = sc.nextInt();


        if(numero %2 == 0){
            System.out.println("ES PAR");
        } else { 
            System.out.println("ES IMPAR");
        }
        sc.close();
    }
}