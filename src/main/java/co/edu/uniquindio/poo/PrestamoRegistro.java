package co.edu.uniquindio.poo;

public class PrestamoRegistro {
    private Libro libro;
    private Cliente cliente;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public PrestamoRegistro(Libro libro, Cliente cliente, Date fechaPrestamo) {
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
    }
}