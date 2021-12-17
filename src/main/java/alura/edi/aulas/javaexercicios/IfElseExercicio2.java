package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseExercicio2
{
    public static void main(String[] args)
    {
        float salario;
        float totalGasto;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.println("Informe o sal�rio: ");
            salario = input.nextFloat();

            System.out.println("Informe o total gasto: ");
            totalGasto = input.nextFloat();

            if (salario >= totalGasto)
            {
                System.out.println("Dentro do or�amento");
            }
            else
            {
                System.out.println("Or�amento estourado");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor inv�lido.");
        }
    }

}
