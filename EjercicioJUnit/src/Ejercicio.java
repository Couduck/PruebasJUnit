public class Ejercicio
{
    public double calcularAreaCuadrado(double lado)
    {
        return Math.pow(lado, 2);
    }

    public double calcularDiametroCirculo(double circunferencia)
    {
        return Math.round(circunferencia/Math.PI*100.0)/100.0;
    }

    public int DigitosEnCadena(String cadena)
    {
        int digitosEncontrados = 0;

        for(byte i = 0; i < cadena.length(); i++)
        {
            if(Character.isDigit(cadena.charAt(i)))
            {
                digitosEncontrados++;
            }
        }

        return digitosEncontrados;
    }

    public int MayusculasEnCadena(String cadena)
    {
        int masyusculasEncontradas = 0;

        for(byte i = 0; i < cadena.length(); i++)
        {
            if(Character.isUpperCase(cadena.charAt(i)))
            {
                masyusculasEncontradas++;
            }
        }

        return masyusculasEncontradas;
    }

    public boolean esPrimo(int numero)
    {
        boolean primo = true;


        if(numero <= 1)
        {
           primo = false;
        }

        else
        {
            switch (numero) {
                case 2:
                case 3:
                case 5:
                case 7:

                    break;

                default:
                    int[] primosPrincipales = {2, 3, 5, 7};

                    for (byte i = 0; i < 4; i++) {
                        if (numero % primosPrincipales[i] == 0) {
                            primo = false;
                            break;
                        }
                    }

                    break;
            }
        }

        return primo;
    }
}
