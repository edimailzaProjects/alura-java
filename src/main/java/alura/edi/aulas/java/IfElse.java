package alura.edi.aulas.java;

public class IfElse
{
    public static void main(String[] args)
    {
        System.out.println("Condicional If");

        int idade = 0;
        int quantAdultos = 3;

        if (idade >= 18)
        {
            System.out.println("Tu és de maior");
        }
        else
        {
            System.out.println("Tu és de menor");

            if (quantAdultos > 0)
            {
                System.out.println("Mas pode entrar, pois estás acompanhado");
            }
        }

        if (idade == 0)
            System.out.println("Sem chaves, tu nem nasceu!");
    }

}
