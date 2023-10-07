package CADENASCHAREQUALS.EJEMPLOS;

import java.util.Scanner;

public class P1INICIOSESION {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        String usuario= "", password="";

        System.out.println("Ingresa tu nombre de usuario: ");
        usuario = sc.nextLine();

        System.out.println("Ingresa tu contraseña: ");
        password = sc.nextLine();

        if(usuario.equals("ernesto") && password.equals("123456789")){
            System.out.println("Inicio de sesión correcto");
        } else {
            System.out.println("Nombre de usuario y contraseña incorrectos");
        }
        sc.close();
    }
}