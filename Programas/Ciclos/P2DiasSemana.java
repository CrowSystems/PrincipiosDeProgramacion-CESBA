package Ciclos;
/*
 * Crea un programa que tome un número del 1 al 7 como entrada y 
 * muestre el día de la semana correspondiente utilizando un switch case.
 */
import java.util.Scanner;

public class P2DiasSemana {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer Op;

        System.out.println("Selecciona un número del 1 al 7");
        Op = sc.nextInt();

        switch (Op) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                break;
        }
        sc.close();
    }
}
