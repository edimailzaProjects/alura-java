package alura.edi.aulas.java;

public class BooleanosEeOu
{
    public static void main(String[] args)
    {
        System.out.println("Condicionais booleanas, E e OU");
        System.out.println("");

        int idade = 2;
        boolean acompanhaAdulto = false;

        if (idade != 0)
        {

            if (idade < 18 && acompanhaAdulto || idade > 18)
            {
                System.out.println("Entrada permitida.");

            }
            else
            {
                System.out.println("Não pode entrar.");
            }

        }
        else
        {
            System.out.println("Idade inválida.");
        }

    }

}
