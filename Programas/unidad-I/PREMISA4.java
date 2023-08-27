import java.util.Scanner;

public class PREMISA4 {
    /* Calcular el área de un triangulo o un cuadrado segun la eleccion
     * del usuario.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double base=0, altura=0, area=0;
        int Seleccion =0;

        System.out.println("Calcula el área");
        System.out.println("1 - Triangulo.");
        System.out.println("2 - Cuadrado.");

        System.out.println("Selecciona una opción por el número: ");
        Seleccion = sc.nextInt();

        if(Seleccion == 1){
            System.out.println("Introduce el valor de la Base: ");
            base = sc.nextDouble();
            System.out.println("Introduce el valor de la Altura: ");
            altura = sc.nextDouble();
            area = (base * altura)/2;
        } else if(Seleccion == 2){
            System.out.println("Introduce el valor de uno de sus lados: ");
            base = sc.nextDouble();
            area = base * 2;
        }
        System.out.println("El area es: " + area);
        sc.close();
    }
}