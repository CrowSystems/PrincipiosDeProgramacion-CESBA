//Importación de libreria Scanner para obtener información del usuario.
import java.util.Scanner;

public class PREMISA1 {
    //Verificar si un numero es positivo o negativo y mostrar un mensaje apropiado en cada caso

    public static void  main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //Declaración de variables.
     float numero=0;

     System.out.println("Ingresa el número a vealuar");
     numero = sc.nextFloat();
     
     if(numero > 0){
        System.out.println("El numero: "+numero+" ES POSITIVO" );
     } else if(numero < 0) {
        System.out.println("El numero: "+numero+" ES NEGATIVO" );
     } 
     else {
        System.out.println("El numero es CERO" );
      }
      sc.close();
    }
}