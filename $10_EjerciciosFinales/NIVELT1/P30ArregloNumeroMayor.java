package $10_EjerciciosFinales.NIVELT1;

import java.util.Scanner;

/*
 * Encontrar el número más grande en un arreglo de enteros.
 */
public class P30ArregloNumeroMayor {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cadena;
    System.out.println("Ingresa la palabra a modificar: ");
    cadena = sc.nextLine();

    //Crea un arreglo con el contenido de la cadena de caracteres y con split devuelve el array omitiendo los pespacios
    String [] palabras = cadena.split(" ");
    int i;

    String resultado="";
    //Crea un arreglo con el tamaño de la cadena.
    for(i=0; i<palabras.length; i++){
        //Toma palabra por palabra y la va convirtiendo en mayusculas
        resultado += palabras[i].toUpperCase();
        //Agrega un espacio final despues de cada palabra.
        resultado += " ";
    }
    resultado = resultado.trim(); //Elimina espacio final al finalizar el arreglo.
    System.out.println(resultado);
 }   
}