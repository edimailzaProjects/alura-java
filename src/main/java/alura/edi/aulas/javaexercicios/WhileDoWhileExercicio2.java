package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileDoWhileExercicio2
{
    public static void main(String[] args)
    {
        int digita;
        int num;
        int aux;
        int total = 1;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        try
        {
            System.out.println("Deseja iniciar? 1 - Sim ou 2 - N�o");
            digita = s.nextInt();
            while (digita == 1 && digita != 2)
            {
                System.out.println("Digite um n�mero: ");
                num = s.nextInt();
                try
                {
                    aux = num;
                    total = total * aux;
                    System.out.println("Deseja inserir outro n�mero? 1 - Sim ou 2 - N�o");
                    digita = s.nextInt();

                    try
                    {
                        if (digita == 2 && digita != 1)
                        {
                            System.out.print("O resultado da multiplica��o �: " + total);
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Digito inv�lido.");
                        break;
                    }

                }
                catch (InputMismatchException e)
                {
                    System.out.println("Digito inv�lido.");
                    break;
                }
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Digito inv�lido.");
        }
    }

}
