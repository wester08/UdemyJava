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
public class TareaNumeroMayor {
    
    public static void main (String args[]){
        
        Scanner consola = new Scanner (System.in);
        
        System.out.println("Proporciona el numero1");
        
        
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2");
        int numero2 = Integer.parseInt(consola.nextLine());
        
        int resultado = (numero1 > numero2 ? numero1 : numero2);
        
        System.out.println("El numero mayor es: " + resultado);
              
    
    }
    
}
