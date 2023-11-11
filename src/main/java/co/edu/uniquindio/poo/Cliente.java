package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private int numeroCliente;
    private List<PrestamoRegistro> prestamos;

    public Cliente(String nombre, String apellido, int edad, int numeroCliente) {
        super(nombre, apellido, edad);
        this.numeroCliente = numeroCliente;
        this.prestamos = new ArrayList<>();
        assert numeroCliente >= 0;
    }

    public void realizarPrestamo(Libro libro) {
        PrestamoRegistro prestamo = new PrestamoRegistro(libro, this, null, null);
        prestamos.add(prestamo);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public List<PrestamoRegistro> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<PrestamoRegistro> prestamos) {
        this.prestamos = prestamos;
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