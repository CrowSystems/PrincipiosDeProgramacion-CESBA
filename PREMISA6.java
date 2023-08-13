import java.util.Scanner;

public class PREMISA6 {
    /*Evaluar si una contraseña ingresada es correcta es valida o no,
     * basándose en ciertas condiciones de login y caracteres.
     * más de 8 caracteres
     * al menos una letra mayuscula
     * al menos un numero
     * al menos un caracter especial
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Declaración de variables.
        String Password, Usuario;

        System.out.println("Ingresa tu Usuario");
        Usuario = sc.nextLine();
        System.out.println("Ingresa la contraseña");
        Password = sc.nextLine();

        if(Password.length() > 8){
            System.out.println("Se a generado tu usuario");
        } else {
            System.out.println("Tu contraseña debe tener mas de 8 carateres");
        }
        sc.close();
    }
}