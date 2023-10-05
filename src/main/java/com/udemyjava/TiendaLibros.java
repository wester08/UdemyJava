import java.util.Scanner;

public class TiendaLibros {

    public static void main(String args[]) {

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = consola.nextLine();

        System.out.println("Proporciona el Id:");
        int id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el Precio:");
        double precio = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el Envio Gratuito:");
        boolean envioGratuito = consola.nextLine() != null;

        System.out.println(nombre + " #" + id);

        System.out.println("Precio: " + "$"+ precio);

        System.out.println("Envio Gratuito: " + envioGratuito);



    }
}
