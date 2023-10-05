import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ConversionDeTipos {
    
    public static void main(String args[]) {

        //Convertir un tipo String a un tipo int

        var edad = Integer.parseInt("20");

        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        System.out.println();
        //Pedir un valor
        // var consola = new Scanner(System.in);
        // System.out.println("Ingrese la edad");
        // edad = Integer.parseInt( consola.nextLine() );
        // System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);;
    }
}
