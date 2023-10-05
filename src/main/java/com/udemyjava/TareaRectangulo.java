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
public class TareaRectangulo {
    
    public static void main (String args[]) {
    
        System.out.println("Proporciona el alto");
        Scanner consola = new Scanner(System.in);
    
        var alto = Integer.parseInt(consola.nextLine());
        System.out.println("alto = " + alto);
        
        System.out.println("Proporciona el ancho");
        var ancho = Integer.parseInt(consola.nextLine());
    
        var area = (alto * ancho);
        var perimtero = (alto * ancho)*2;
        
        System.out.println("area = " + area);
        System.out.println("perimtero = " + perimtero);
        
        
        
        
        
        
        
    }
    
}
