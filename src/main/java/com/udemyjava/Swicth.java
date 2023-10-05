/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author wester.feliz
 */
public class Swicth {
    
    public static void main (String args[]){

//        Scanner consola = new Scanner(System.in);
//        
//        var numero = Integer.parseInt(consola.nextLine());
//        
//        var numeroTexto = "Valor desconocido";
//
//        switch (numero) {
//            case 1:
//                numeroTexto = "Numero uno";
//                break;
//            case 2:
//                numeroTexto = "Numero dos";
//                break;
//            case 3:
//                numeroTexto = "Numero tres";
//                break;
//            case 4:
//                numeroTexto = "Numero cuatro";
//                break;
//            default:
//                numeroTexto = "Caso no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//    }

        Scanner consola = new Scanner(System.in);
        
        var mes = Integer.parseInt(consola.nextLine());
        
        var estacion = "Estacion desconocido";

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Inverno";
                break;
            case 3: case 4: case 5:
                 estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                    estacion = "Otonio";
                break;
            default:
                estacion = "Estacion no encontrada";
        }
        System.out.println("estacion = " + estacion);
    }
    
 
}
