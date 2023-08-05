public class EjemploOperadorLogicos {
    public static void main(String[] args){
        int edad=25;
        boolean esEstudiante = true;

        if(edad >= 18 && esEstudiante) {
            System.out.println("Eres Mayor de Edad y Estudiante.");
        } else {
            System.out.println("No comples ambas condiciones");
        }
    }
}