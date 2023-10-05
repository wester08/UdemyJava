package com.udemyjava;

public class CaracteresEspeciales {
    public static void main(String args[]) {

        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre); // imprimir en una linea nueva
        System.out.println("Nueva linea: \t" + nombre);// imprimir con un TABULADOR
        System.out.println("Nueva linea: \b\b" + nombre); //retroceso
        System.out.println("Comilla simple: \'" + nombre + "\'"); //Comillas simples
        System.out.println("Comilla doble: \"" + nombre + "\" "); //Comillas dobles
        
    }
}