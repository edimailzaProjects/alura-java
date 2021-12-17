package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseExercicio3
{
    public static void main(String[] args)
    {
        int valor;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.println("Informe um numero inteiro: ");
            valor = input.nextInt();

            if (valor % 5 == 0)
            {
                System.out.println("� multiplo de 5");
            }
            else
            {
                System.out.println("N�o � m�ltiplo de 5");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor inv�lido.");
        }
    }

}
