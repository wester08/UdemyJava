/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java.JavaClass;

/**
 *
 * @author wester.feliz
 */
public class Operadores {
    
    public static void main (String args[]) {
        //Operadores aritmeticos
//        int a = 3, b = 2;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//
//        resultado = a - b;
//        System.out.println("resultado resta= " + resultado);
//
//        resultado = a * b;
//        System.out.println("resultado multiplicacion= " + resultado);
//
//        var resultadoDos = 3F / b;
//        System.out.println("resultado division = " + resultadoDos);
//
//        resultado = a % b;
//        System.out.println("resultado modulo = " + resultado);
//
//        if (b % 2 == 0) {
//            System.out.println("Es numero par");
//        } else {
//            System.out.println("Es numero impar");
//        }

        
        //Operadores de asignacion
//        int a = 3, b = 2;
//        int c = a + 5 - b;
//        System.out.println("c = " + c);
//        
//        a += 1; // a = a + 1
//        System.out.println("a = " + a);
//        
//        a += 3;
//        System.out.println("a = " + a);
//        
//        a -= 1;
//        System.out.println("a = " + a);
//        
//        a *= 2;
//        System.out.println("a = " + a);
//        
//        a /= 2;
//        System.out.println("a = " + a);
//        
//        a %= 1; //Estudiar este operador
//        System.out.println("a = " + a);
        
        //Operadores Unitarios
//        
//        var a = 3;
//        var b = -a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        
//        var c = true;
//        var d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        
//        //Incremento
//        //1. Preincremento (simbolo antes de la variable)
//        
//        var e =3;
//        var f = ++e; //primero incrementa la variable y despues utiliza su valor    
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        
//        //2. Postincremento (Simbolo despues del valor)
//        var g = 5;
//        var h = g++; //primero se asigna el valor y luego se incrementa.
//        System.out.println("g = " + g);
//        System.out.println("h = " + h);
//        
//        //decremento
//        //1. predecremento
//        
//        var i = 2;
//        var j = --i;
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        
//        //2.postdecremento
//        var k = 4;
//        var l = k--;
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);

//Operadores de asignacion y relacionales
//
//        var a = 3;
//        var b = 2;
//        
//        var c = (a == b);
//        System.out.println("c = " + c);
//        
//        var d = a != b;
//        System.out.println("d = " + d);
//        
//        var cadena = "Hola";
//        var cadena2 = "Hola";
//        
//        var e = cadena == cadena2; // compara la referencia del objeto
//        System.out.println("e = " + e);
//        
//        var f = cadena.equals(cadena2);// comparamos contenidos de cadenas.
//        
//        System.out.println("f = " + f);
//        
//        var g = a >= b;
//        System.out.println("g = " + g);
// 
//        if ( a % 2 == 0) {
//            System.out.println("Es numero impar");
//        } else {
//            System.out.println("Es numero par");
//        }
//        
//        var edad = 10;
//        var adulto = 18;
//        if(edad >= adulto) {
//            System.out.println("Es un adulto");
//        }
//        
//        else{
//            System.out.println("Es menor de edad");
//        }
//        
//    }
//         // Operadores condicionales && ||
//        var a = 11;
//        var valorMinimo = 0;
//        var valorMaximo = 10;
//
//        var resultado = a >= 0 && a <= 10;
//
//        if (resultado) {
//            System.out.println("Dentro de rango");
//        } else {
//            System.out.println("Fuera de rango");
//        }
//
//        var vacaciones = true;
//        var diaDescanso = false;
//
//        if (vacaciones || diaDescanso) {
//            System.out.println("Padre puede asistir al juego de su hijo");
//
//        } else {
//            System.out.println("El padre esta ocupado");
//        }

//        //Operador tenario
//        var resultado = (1 > 2) ? "verdadero" : "falso";
//        System.out.println("resultado = " + resultado);
//
//        var numero = 9;
//        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
//        System.out.println("rsultado = " + resultado);

         //Precedencia de operadores = orden en que se ejecutan los operadores
         
         var x = 5;
         var y = 10;
         var z = ++x + y--;
         System.out.println("X =" + x);
         System.out.println("Y =" + y);
         System.out.println("Z =" + z);
         
         
         var resultado = 4 + 5 * 6 / 3; //4 + ((5*6)/3))
         System.out.println("resultado = " + resultado);
         
         resultado = (4 + 5) * 6 / 3;
         System.out.println("resultado = " + resultado);
         
       
    }

}
