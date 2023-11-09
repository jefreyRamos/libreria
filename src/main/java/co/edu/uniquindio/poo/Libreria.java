package co.edu.uniquindio.poo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Libreria implements Prestamo {
    private List<Libro> librosDisponibles;
    private List<Cliente> clientes;
    private List<PrestamoRegistro> registrosPrestamo;

    
    public Libreria(List<Libro> librosDisponibles, List<Cliente> clientes, List<PrestamoRegistro> registrosPrestamo) {
        this.librosDisponibles = librosDisponibles;
        this.clientes = clientes;
        this.registrosPrestamo = registrosPrestamo;
    }

    public List<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(List<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<PrestamoRegistro> getRegistrosPrestamo() {
        return registrosPrestamo;
    }

    public void setRegistrosPrestamo(List<PrestamoRegistro> registrosPrestamo) {
        this.registrosPrestamo = registrosPrestamo;
    }

    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<PrestamoRegistro> buscarPrestamosPorLibro(Libro libro) {
        List<PrestamoRegistro> prestamos = new ArrayList<>();
        for (PrestamoRegistro registro : registrosPrestamo) {
            if (registro.getLibro().equals(libro)) {
                prestamos.add(registro);
            }
        }
        return prestamos;
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getAutor().equals(autor)) {
                libros.add(libro);
            }
        }
        return libros;
    }

    @Override
    public void prestarLibro(Cliente cliente, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            librosDisponibles.remove(libro);
            cliente.realizarPrestamo(libro);
            PrestamoRegistro registro = new PrestamoRegistro(libro, cliente, new fechaPrestamo());
            registrosPrestamo.add(registro);
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    @Override
    public void devolverLibro(Cliente cliente, Libro libro) {
        for (PrestamoRegistro registro : registrosPrestamo) {
            if (registro.getCliente().equals(cliente) && registro.getLibro().equals(libro) && registro.getFechaDevolucion() == null) {
                registro.setFechaDevolucion(new fechaDevolucion());
                librosDisponibles.add(libro);
            }
        }
    }
}