import java.util.Scanner;

public class PREMISA3 {
    /* Determinar si una persona puede acceder a un sitio web 
     * basado en su edad y mostrar un mensaje de acceso conseguido
     * o denegado.
     * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Declaración de variables
        int edad=0;
        
        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();

        //Inicia la condición
        if(edad >= 18) {
            System.out.println("ACCESO CONSEGUIDO" );
        } else {
            System.out.println("ACCESO DENEGADO" );
        }
        sc.close();
    }
}