import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest3
{
    Ejercicio ejercicio = new Ejercicio();

    @org.junit.jupiter.api.Test
    void digitosEnCadenaVerdadero()
    {
        assertEquals(10, ejercicio.DigitosEnCadena("Mi numero es 9991119990"));
    }

    @org.junit.jupiter.api.Test
    void digitosEnCadenaFalso()
    {
        assertEquals(5, ejercicio.DigitosEnCadena("Vivo en la calle 125"));
    }
}

