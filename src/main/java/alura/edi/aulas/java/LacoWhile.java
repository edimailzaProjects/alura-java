package alura.edi.aulas.java;

public class LacoWhile
{
    public static void main(String[] args)
    {
        int contador = 0;

        while (contador < 10)
        {
            System.out.println(contador);
            contador += 1;

        }

        do
        {
            System.out.println(contador);
            contador += 1;
        }
        while (contador < 10);
    }

}
