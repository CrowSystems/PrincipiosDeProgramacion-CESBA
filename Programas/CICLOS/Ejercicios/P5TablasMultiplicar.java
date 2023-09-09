package CICLOS.Ejercicios;

import java.io.IOException; //Con esta libreria importamos herramienta para ejecutas "cls"
import java.util.Scanner; //Con esta libreria importamos las herramientas para almacenar en una variable

public class P5TablasMultiplicar {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables.
        int i, res,opcion=1;
        
        //ciclo para seguir realizando operaciones
        do{
            System.out.println("***************Sistema de tablas de multiplicar**************");
            System.out.println("Que tabla deseas que se multiplique: ");
            opcion = sc.nextInt();

            for(i=1; i <= 10; i++){
                res = i * opcion;
                System.out.println(i + " * " + opcion + " = " + res);
            }

            System.out.println("Deseas realizar otra operación: SI[1] / NO[0]");
            opcion = sc.nextInt();
            
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //comando para borrar consola
        }while(opcion != 0);
    }    
}
