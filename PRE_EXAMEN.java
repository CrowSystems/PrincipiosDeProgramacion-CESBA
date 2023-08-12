import java.util.Scanner;

public class PRE_EXAMEN {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        float Operacion = 0, resultado = 0;
        int numero_uno = 0, numero_dos=0;
        
        
        System.out.println("Realiza Operaciones");
        System.out.println("Introduce tu primer numero: ");
        numero_uno = sc.nextInt();
        System.out.println("Introduce tu segundo número: ");
        numero_dos = sc.nextInt();
        
        
        System.out.println("Lista de Opciones");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplica");
        System.out.println("4 - Divide");
        System.out.println("Selecciona una Opción.");
        Operacion = sc.nextFloat();

        if(Operacion == 1){
            resultado = numero_uno + numero_dos;
        } else if (Operacion == 2) {
            resultado = numero_uno - numero_dos;
        } else if(Operacion == 3){
            resultado = numero_uno * numero_dos;
        } else if (Operacion == 4) {
            resultado = numero_uno / numero_dos;
            
        } else {
            System.out.println("Selecciona una Opcion Valida");
        }
        System.out.println("El resultado es: " + resultado);
        
    }
}
    
