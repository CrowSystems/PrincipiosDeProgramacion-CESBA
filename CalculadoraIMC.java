import java.util.Scanner;

public class CalculadoraIMC{
    public static void main(String[] args) {
        float IMC=0, peso=50, altura=0;
        
        Scanner datos = new Scanner(System.in);
    
        System.out.println("Introduce tu altura: ");    
        altura = datos.nextFloat();
        System.out.println("Introduce tu peso");
        peso = datos.nextFloat();
        
        IMC = peso / (altura * altura);
        
        if(IMC <= 40.5){
            System.out.println("Tu peso es bajo");
        } else if(IMC> 40.5 && IMC < 80) {
            System.out.println("Estas en tu peso normal");
        } else {
            System.out.println("Tienes sobre peso");
        }
    }
}