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
    }

    @Override
    public void obtenerAtributos() {
    }

    @Override
    public void establecerAtributos() {
    }

    public void realizarPrestamo(Libro libro) {
        PrestamoRegistro prestamo = new PrestamoRegistro(libro, this, null);
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
    
}