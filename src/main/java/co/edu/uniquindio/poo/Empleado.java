package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private String cargo;

    public Empleado(String nombre, String apellido, int edad, String cargo) {
        super(nombre, apellido, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}