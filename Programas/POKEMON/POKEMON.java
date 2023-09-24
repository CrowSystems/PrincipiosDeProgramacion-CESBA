package POKEMON;

import java.util.Scanner;

public class POKEMON {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    String pokemon,Seleccion;
    String TipoPoke[] = new String[11];
    //String[] prueba = {"ACERO","VOLADOR"};

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

    System.out.print("Selecciona un tipo de pokemon: ");
    pokemon = sc.nextLine().toUpperCase();

    if(pokemon.equals(TipoPoke[0]))
    {
        System.out.println("Que caracteristica deseas seleccionar: ");
        Seleccion = sc.nextLine().toUpperCase();
        
        //if(Seleccion.equals()))
        System.out.println("EFECTIVO");
        //System.out.println(prueba[0]);
        //System.out.println(TipoPoke[3]+"\t"+TipoPoke[8]);
        
        System.out.println("NO EFECTIVO");
        System.out.println(TipoPoke[3]+"\t"+TipoPoke[8])
        ;
        System.out.println("DEBIL");

    }else if(pokemon.equals(TipoPoke[1])){
        System.out.println("EFECTIVO");
        
        System.out.println("PLANTA, BICHO");
        
        System.out.println("NO EFECTIVO");
        
        System.out.println("DEBIL");
    }else {
        System.out.println("El tipo de pokemon no existe");
    }
    sc.close();
    }
}
