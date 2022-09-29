import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest4
{
    Ejercicio ejercicio = new Ejercicio();

    @org.junit.jupiter.api.Test
    void mayusculasEnCadenaVerdadero()
    {
        assertEquals(4, ejercicio.MayusculasEnCadena("Hola! mi nombre es Patricio Estrada Carreto"));
    }

    @org.junit.jupiter.api.Test
    void mayusculasEnCadenaFalso()
    {
        assertEquals(2, ejercicio.MayusculasEnCadena("Lo siento, podrías repetirlo?"));
    }
}

