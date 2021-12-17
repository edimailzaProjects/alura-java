package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileDoWhileExercicio1
{
    public static void main(String[] args)
    {
        int escolha = 0;
        int num;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("É Par ou impar?");
        try
        {
            System.out.println("Deseja iniciar? 1 - Sim, 2 - Não");
            escolha = s.nextInt();

            if (escolha == 1)
            {
                do
                {
                    System.out.println("Digite um número: ");
                    num = s.nextInt();

                    if (num % 2 == 0)
                    {
                        System.out.println("O número " + num + " é par");

                    }
                    else
                    {
                        System.out.println("O número " + num + " é impar");
                    }

                    System.out.println("Deseja realizar nova consulta? 1 - Sim, 2 - Não");
                    escolha = s.nextInt();

                    if (escolha == 2)
                    {
                        System.out.println("Flw! Vlw!");
                    }
                }
                while (escolha != 2);
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Não é um valor válido");
        }

    }

}
