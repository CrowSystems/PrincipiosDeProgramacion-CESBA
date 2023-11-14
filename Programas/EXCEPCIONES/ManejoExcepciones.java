package EXCEPCIONES;
public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            //Excepción
            int resultado = dividir(10,0);
        } catch (ArithmeticException e) {
            //Captura la excepcion aritmetica.
            System.out.println("Error al dividir entre cero.");
        } finally {
            //Este bloque para mensaje de finalización
            System.out.println("Operacion Completada");
        }
    }
    public static int dividir(int numerador, int denominador) {
        //Metodo que lanza la excepción
        return numerador / denominador;
    } 
}
