package co.edu.uniquindio.poo;

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
}