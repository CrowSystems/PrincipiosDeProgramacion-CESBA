import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int temperatura;

        System.out.println("Ingresa la temperatura: ");
        temperatura = sc.nextInt();


        if(temperatura > 25){
            System.out.println("A la Playa!!!!");
        }
        if(temperatura <= 25) {
            System.out.println("Esperando al buen tiempo...");
        }
    }
}