package co.edu.uniquindio.poo;

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void obtenerAtributos();

    public abstract void establecerAtributos();
}
