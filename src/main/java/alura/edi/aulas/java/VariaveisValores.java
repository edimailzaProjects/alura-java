package alura.edi.aulas.java;

public class VariaveisValores
{
    public static void main(String[] args)
    {
        // Por Valor

        System.out.println("Passagem por valor");

        int primeiroNumero = 5;
        int segundoNumero = 10;

        System.out.println(segundoNumero);

        segundoNumero = primeiroNumero;

        System.out.println(segundoNumero);

        primeiroNumero = 15;
        segundoNumero = primeiroNumero;
        System.out.println(segundoNumero);
    }

}
