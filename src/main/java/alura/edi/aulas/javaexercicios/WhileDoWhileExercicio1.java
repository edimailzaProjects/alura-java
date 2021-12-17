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

        System.out.println("� Par ou impar?");
        try
        {
            System.out.println("Deseja iniciar? 1 - Sim, 2 - N�o");
            escolha = s.nextInt();

            if (escolha == 1)
            {
                do
                {
                    System.out.println("Digite um n�mero: ");
                    num = s.nextInt();

                    if (num % 2 == 0)
                    {
                        System.out.println("O n�mero " + num + " � par");

                    }
                    else
                    {
                        System.out.println("O n�mero " + num + " � impar");
                    }

                    System.out.println("Deseja realizar nova consulta? 1 - Sim, 2 - N�o");
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
            System.out.println("N�o � um valor v�lido");
        }

    }

}
