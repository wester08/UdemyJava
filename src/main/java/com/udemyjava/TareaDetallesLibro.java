import java.util.Scanner;

public class TareaDetallesLibro {

    public static void main(String args[]) {

        System.out.println("Proporciona el titulo:");

        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Titulo = " + titulo);

        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println("autor = " + autor);

        System.out.println("El libro: " + titulo + " fue escrito por " + autor);

    }

}
