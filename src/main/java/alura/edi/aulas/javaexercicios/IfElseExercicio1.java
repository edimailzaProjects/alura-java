package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseExercicio1
{
    public static void main(String[] args)
    {
        int num1;
        int num2;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("Os números inteiros são iguais ou diferentes?");
        System.out.println();

        try
        {
            System.out.println("Informe o primeiro numero: ");
            num1 = s.nextInt();
            System.out.println("Informe o segundo numero: ");
            num2 = s.nextInt();

            if (num1 == num2)
            {
                System.out.println("Os números são iguais");
            }
            else if (num1 > num2)
            {
                System.out.println(
                        "Os números são diferentes e o primeiro, " + num1 + ", é maior que o segundo, " + num2);
            }
            else
            {
                System.out.println(
                        "Os números são diferentes e o segundo, " + num2 + ", é maior que o primeiro, " + num1);
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor Inválido");
        }

    }

}
