package co.edu.uniquindio.poo;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    

    public abstract void obtenerAtributos();

    public abstract void establecerAtributos();
}
