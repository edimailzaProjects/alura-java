package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LacosExercicio1
{
    public static void main(String[] args)
    {
        // Lista de exerc�cios da USP

        System.out.println("--Qual � o maior n�mero?--");
        System.out.println();

        int aux = 0;
        int num;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 15; i++)
        {
            System.out.print("Digite o " + i + "� n�mero: ");

            try
            {
                num = s.nextInt();
                if (num > aux)
                {
                    aux = num;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("D�gito inv�lido.");
                break;
            }
        }
        System.out.println("O maior n�mero �: " + aux);
    }

}
