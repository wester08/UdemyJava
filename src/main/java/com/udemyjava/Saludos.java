
//Mi clase en Java
public class Saludos {
    public static void main(String args[]) {

        var usuario = "juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

       
        var i = 3;
        var j = 4;

        System.out.println(i + j); //Suma de numeros
        System.out.println(i +j + usuario); //Evaluacion de Izq a Der, realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); //uso de parentesis modifican la prioridad
      
    }
}
