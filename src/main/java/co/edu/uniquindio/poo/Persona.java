package co.edu.uniquindio.poo;

public abstract class Persona {
    protected final String nombre;
    protected final String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        assert nombre != null;
        assert apellido != null;
        assert edad >= 0;
    }

    public abstract String getNombre();
    public abstract String getApellido();
    public abstract int getEdad();
    public abstract void setEdad(int edad);

}