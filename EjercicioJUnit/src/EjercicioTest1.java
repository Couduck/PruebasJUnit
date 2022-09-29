import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest1
{
    Ejercicio ejercicio = new Ejercicio();

    @org.junit.jupiter.api.Test
    void calcularAreaCuadradoVerdadero()
    {
        assertEquals(25, ejercicio.calcularAreaCuadrado(5));
    }

    @org.junit.jupiter.api.Test
    void calcularAreaCuadradoFalso()
    {
        assertEquals(12, ejercicio.calcularAreaCuadrado(6));
    }
}

