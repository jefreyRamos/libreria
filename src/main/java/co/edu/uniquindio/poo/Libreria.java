package co.edu.uniquindio.poo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libreria implements Prestamo {
    private List<Libro> librosDisponibles;
    private List<Cliente> clientes;
    private List<PrestamoRegistro> registrosPrestamo;

    public Libreria () {
        librosDisponibles = new ArrayList<>();
        clientes = new ArrayList<>();
        registrosPrestamo = new ArrayList<>();
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
            if (libro.getAutor().equalsIgnoreCase(autor)) {
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
            final PrestamoRegistro registro = new PrestamoRegistro(libro, cliente, new Date(0), null);
            registrosPrestamo.add(registro);
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    @Override
    public void devolverLibro(Cliente cliente, Libro libro) {
        for (PrestamoRegistro registro : registrosPrestamo) {
            if (registro.getCliente().equals(cliente) && registro.getLibro().equals(libro) && registro.getFechaDevolucion() == null) {
                registro.setFechaDevolucion(LocalDate.now());
                librosDisponibles.add(libro);
            }
        }
    }
}