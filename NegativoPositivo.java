public class NegativoPositivo {
    //Evalua un numero y muestra si es positivo o negativo

    public static void  main(String[] args) {
     float numero=0;
     
     if(numero > 0){
        System.out.println("El numero: "+numero+" ES POSITIVO" );
     } else if(numero < 0) {
        System.out.println("El numero: "+numero+" ES NEGATIVO" );
     } 
     else {
        System.out.println("El numero es CERO" );
     }
    }
}