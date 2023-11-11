package co.edu.uniquindio.poo;
import java.sql.Date;
import java.time.LocalDate;

public class PrestamoRegistro {
    private Libro libro;
    private Cliente cliente;
    private Date fechaPrestamo;
    private LocalDate fechaDevolucion;

    public PrestamoRegistro(Libro libro, Cliente cliente, Date fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
        assert libro != null;
        assert cliente != null;
        assert fechaPrestamo != null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}