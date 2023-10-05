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
public class TareaSistemaCalificaciones {

    public static void main(String args[]) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Porporcione un valor de 0 a 10: ");

        var calificacion = Integer.parseInt(consola.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");

        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Usted se la acaba de beber");
        }

    }

}

