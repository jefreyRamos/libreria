package co.edu.uniquindio.poo;

public interface Prestamo {
    void prestarLibro(Cliente cliente, Libro libro);

    void devolverLibro(Cliente cliente, Libro libro);
}