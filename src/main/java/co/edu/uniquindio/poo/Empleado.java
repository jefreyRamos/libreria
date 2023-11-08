package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String apellido, int edad, String cargo) {
        super(nombre, apellido, edad);
        this.cargo = cargo;
    }

    @Override
    public void obtenerAtributos() {
    }

    @Override
    public void establecerAtributos() {
    }
}