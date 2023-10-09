package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona = " + persona.nombre);
        System.out.println("persona = " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this= " + this);
        //Imprimir imprimir = new Imprimir
        new Imprimir().imprimir(this);


    }

}

class Imprimir {
    public void imprimir (Persona persona){
        System.out.println("Persona desde imprimir" + persona);
        System.out.println("impresion del objeto actual (this)" + this);

    }
}