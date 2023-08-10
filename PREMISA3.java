public class PREMISA3 {
    //Un usuario ingresa su edad y el programa evalua si es mayor de edad o no para darle acceso.
    public static void main(String[] args){
        //definicion de la variable tipo int dado que es un numero entero la edad
        int edad = 18;
        
        //Inicia la condición
        if(edad >= 18) {
            System.out.println("ACCESO CONSEGUIDO" );
        } else {
            System.out.println("ACCESO DENEGADO" );
        }
    }
}