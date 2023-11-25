package $10_EjerciciosFinales.NIVELW1;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Contar la cantidad de palabras en una cadena.
 */
public class P46ConteoPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        System.out.println("Introduce la frace para contar: ");
        a = sc.nextLine();

        StringTokenizer st = new StringTokenizer(a);
        System.out.println("El número de parabaras son: "+st.countTokens());
        
        sc.close();
    }
}