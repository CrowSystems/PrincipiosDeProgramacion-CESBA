//Importación de la libreria Scanner esta libreria nos permite leer datos introducidos en el sistema.
import java.util.Scanner;

public class PREMISA5 {
    /*
     * Evaluación si es Par o Impar un numero Entero
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Ingresa el numero a evaluar: ");
        numero = sc
        if(numero %2 == 0){
            System.out.println("ES PAR");
        } else { 
            System.out.println("ES IMPAR");
        }
    }
}