/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.JavaClass;

import java.util.Scanner;

/**
 *
 * @author wester.feliz
 */
public class SentenciaIfElse {

    public static void main(String args[]) {

//        var condicion = true;
//
//        if (condicion == true) {
//            System.out.println("Condicion verdadera");
//        } else {
//            System.out.println("Condicion falsa");
//        }
//        
//        var numero = 5;
//        var numeroTexto = "Numero desconocido";
//
//        if (numero == 1) {
//            numeroTexto = "Numero uno";
//        } else if (numero == 2) {
//            numeroTexto = "Numero dos";
//
//        } else if (numero == 3) {
//            numeroTexto = "Numero tres";
//        } else if (numero == 4) {
//            numeroTexto = "Numero cuatro";
//        } else {
//            numeroTexto = "Numero no encontrado";
//        }
//
//        System.out.println("numeroTexto = " + numeroTexto);
//    }
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporcione el mes");
        
        var mes = Integer.parseInt(consola.nextLine());
        
        var estacion = "Estancion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Ontono";
        } 
        System.out.println("estacion = " + estacion);
           
        }
}
