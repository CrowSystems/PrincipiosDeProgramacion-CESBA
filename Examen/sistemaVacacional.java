
/**
 * Principios de Programación 
 * Grupo 2A
 * De Jesus Mendoza Carlos Ivan.
 * */
//Nombre de a carpeta localizado
package Examen;

//Impotación de libreria
import java.util.Scanner;
 
public class sistemaVacacional {

    public static void main(String[] args){
        
        //creación de objero scaner para almacenamiento de de variables
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        String nombre;
        int clave = 0, antiguedad=0;


        //Inicio de programa
        System.out.println("********** Bienvenido al sistema Vacacional de Coca-Cola Company **********");
        System.out.println("¿Cual es el nombre del trabajador? ");
        nombre = sc.nextLine();
        System.out.println("¿Cuantos años de servicio tiene el trabajador? ");
        antiguedad = sc.nextInt();
        System.out.println("¿Cual es la clave de su departamento? ");
        clave = sc.nextInt();

        //Inicio de condiciones
        if(clave == 1)
        {
            if(antiguedad == 1){
                System.out.println(nombre+" derecho a 6 días");        
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre+" derecho a 14 días");        
            } else if(antiguedad == 7){
                System.out.println(nombre+" derecho a 20 días");        
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");        
            }
        } else if(clave == 2){
            if(antiguedad == 1){
                System.out.println(nombre+" derecho a 7 días");        
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre+" derecho a 15 días");        
            } else if(antiguedad == 7){
                System.out.println(nombre+" derecho a 22 días");        
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");        
            }
        } else if(clave == 3){
            if(antiguedad == 1){
                System.out.println(nombre+" derecho a 10 días");        
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre+" derecho a 20 días");        
            } else if(antiguedad == 7){
                System.out.println(nombre+" derecho a 30 días");        
            } else {
                System.out.println("Aun no tiene derecho a vacaciones");        
            }

        } else {
            System.out.println("Error, la clave de departamento no existe");
        }
        sc.close();
    }
}