import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest5
{
    Ejercicio ejercicio = new Ejercicio();

    @org.junit.jupiter.api.Test
    void esPrimoTrue()
    {
        assertTrue(ejercicio.esPrimo(19));
    }

    @org.junit.jupiter.api.Test
    void esPrimoFalse()
    {
        assertFalse(ejercicio.esPrimo(3));
    }
}

