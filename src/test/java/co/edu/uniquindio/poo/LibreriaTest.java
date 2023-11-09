package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.List;
import java.util.logging.Logger;

public class LibreriaTest {
public static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void registrarYBuscarLibro() {
        Libro libro = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 5);
        libreria.registrarLibro(libro);

        assertTrue(libreria.buscarLibrosPorAutor("Carlos Ruiz Zafón").contains(libro));
        assertTrue(libreria.buscarLibrosPorAutor("Isabel Allende").isEmpty());
        assertTrue(libreria.buscarPrestamosPorLibro(libro).isEmpty());
    }

    @Test
    public void registrarYBuscarCliente() {
        Cliente cliente = new Cliente("Juan", "Pérez", 30, 12345);
        libreria.registrarCliente(cliente);

        assertTrue(libreria.buscarPrestamosPorLibro(new Libro("Un libro cualquiera", "Autor Desconocido", 1)).isEmpty());
        assertEquals(cliente, libreria.buscarClientePorNumero(12345));
    }

    @Test
    public void realizarPrestamoYDevolverLibro() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 3);
        libreria.registrarLibro(libro);

        Cliente cliente = new Cliente("Maria", "Gomez", 25, 54321);
        libreria.registrarCliente(cliente);

        libreria.prestarLibro(cliente, libro);

        assertEquals(2, libro.getEjemplaresDisponibles());
        assertEquals(1, cliente.getPrestamos().size());

        PrestamoRegistro prestamo = cliente.getPrestamos().get(0);
        assertNotNull(prestamo.getFechaPrestamo());
        assertNull(prestamo.getFechaDevolucion());

        libreria.devolverLibro(cliente, libro);
        assertEquals(3, libro.getEjemplaresDisponibles());
        assertNotNull(prestamo.getFechaDevolucion());
    }
}
