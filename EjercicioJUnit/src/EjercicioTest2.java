import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest2
{
    Ejercicio ejercicio = new Ejercicio();

    @org.junit.jupiter.api.Test
    void calcularDiametroCirculoVerdadero()
    {
        assertEquals(6.37, ejercicio.calcularDiametroCirculo(20));
    }

    @org.junit.jupiter.api.Test
    void calcularDiametroCirculoFalso()
    {
        assertEquals(5, ejercicio.calcularDiametroCirculo(15));
    }
}

