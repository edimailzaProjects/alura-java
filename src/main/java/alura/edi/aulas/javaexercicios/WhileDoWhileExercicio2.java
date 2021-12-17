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
            System.out.println("Deseja iniciar? 1 - Sim ou 2 - Não");
            digita = s.nextInt();
            while (digita == 1 && digita != 2)
            {
                System.out.println("Digite um número: ");
                num = s.nextInt();
                try
                {
                    aux = num;
                    total = total * aux;
                    System.out.println("Deseja inserir outro número? 1 - Sim ou 2 - Não");
                    digita = s.nextInt();

                    try
                    {
                        if (digita == 2 && digita != 1)
                        {
                            System.out.print("O resultado da multiplicação é: " + total);
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Digito inválido.");
                        break;
                    }

                }
                catch (InputMismatchException e)
                {
                    System.out.println("Digito inválido.");
                    break;
                }
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Digito inválido.");
        }
    }

}
