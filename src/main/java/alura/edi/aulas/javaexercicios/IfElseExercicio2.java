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
            System.out.println("Informe o salário: ");
            salario = input.nextFloat();

            System.out.println("Informe o total gasto: ");
            totalGasto = input.nextFloat();

            if (salario >= totalGasto)
            {
                System.out.println("Dentro do orçamento");
            }
            else
            {
                System.out.println("Orçamento estourado");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor inválido.");
        }
    }

}
