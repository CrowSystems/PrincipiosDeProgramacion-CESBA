package POKEMON;                                                            //Nombre de la carpeta de almacenamiento
/*
 * Author: Carlos Ivan de Jesus Mendoza
 * Materia: Principios de programación.
 * Grupo: 2A
 * Escuela: CESBA
 * 
 */

//Libreria para utilizar las herramientas de java para solicitar información al usuario
import java.util.Scanner;

//Inicio de programa
public class POKEMON {
    
    //Inicio del metodo main para su ejecución
    public static void main(String[] args) {
    
    //Declarción de variable de tipo scanner para almacenar información temporalmente.
    Scanner sc = new Scanner(System.in);

    //  Declaración de variables de usuario
    String pokemon,Seleccion;

    //  Declaración de arreglo
    String TipoPoke[] = new String[18];
    
    
    //String[] prueba = {"ACERO","VOLADOR"};

    //Registro de contenido dentro del arreglo
    TipoPoke[0]="ACERO";
    TipoPoke[1]="VOLADOR";
    TipoPoke[2]="AGUA";
    TipoPoke[3]="HIELO";
    TipoPoke[4]="PLANTA";
    TipoPoke[5]="BICHO";
    TipoPoke[6]="ELECTRICO";
    TipoPoke[7]="NORMAL";
    TipoPoke[8]="ROCA";
    TipoPoke[9]="TIERRA";
    TipoPoke[10]="FUEGO";
    TipoPoke[11]="LUCHA";
    TipoPoke[12]="HADA";
    TipoPoke[13]="PSIQUICO";
    TipoPoke[14]="VENENO";
    TipoPoke[15]="DRAGON";
    TipoPoke[16]="FANTASMA";
    TipoPoke[17]="SINIESTRO";

    //almacenamiento de variables de selección de opciones.
    System.out.print("Selecciona un tipo de pokemon: ");
    pokemon = sc.nextLine().toUpperCase();
    System.out.println("Que caracteristica deseas seleccionar: ");
    Seleccion = sc.nextLine().toUpperCase();

   //Condicionales de selección dde información
   //pokemon(variable de almacenamiento).equals(condición para igualar)(TipoPoke[0])(ubicación dentro del arreglo para )
if(pokemon.equals(TipoPoke[0]))
    {       
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    
    }else if(pokemon.equals(TipoPoke[1])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[4]+"\t|"+TipoPoke[5]+"\t|"+TipoPoke[11]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[8]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[8]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[9]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[2])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[3])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[4])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[5])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[6])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[7])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[8])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[9])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[10])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[11])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[12])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[13])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[14])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[3]+"\t|"+TipoPoke[8]+"\t|"+TipoPoke[12]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[0]+"\t|"+TipoPoke[2]+"\t|"+TipoPoke[6]+"\t|"+TipoPoke[10]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[9]+"\t|"+TipoPoke[10]+"\t|"+TipoPoke[11]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[14]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[15])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[15]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println( TipoPoke[1]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println( TipoPoke[3]+"\t|"+TipoPoke[12]+"\t|"+TipoPoke[15]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println("NINGUNO");

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[16])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[13]+"\t|"+TipoPoke[16]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[17]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[16]+"\t|"+TipoPoke[17]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[11]+"\t|"+TipoPoke[7]]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }else if(pokemon.equals(TipoPoke[17])){
        if(Seleccion.equals("EFECTIVO")) {
            System.out.println("EFECTIVO");
            System.out.println(TipoPoke[13]+"\t|"+TipoPoke[16]);

        } else if(Seleccion.equals("NO EFECTIVO")){
            System.out.println("NO EFECTIVO");
            System.out.println(TipoPoke[11]+"\t|"+TipoPoke[12]+"\t|"+TipoPoke[17]);

        }else if(Seleccion.equals("DEBIL")){
            System.out.println("DEBIL");
            System.out.println(TipoPoke[5]+"\t|"+TipoPoke[11]+"\t|"+TipoPoke[12]);

        }else if(Seleccion.equals("INMUNE")){
            System.out.println("INMUNE");
            System.out.println(TipoPoke[13]);

        }else {
            System.out.println("Error introuce un valor valido.");
        }
    }
    sc.close();
    }
}