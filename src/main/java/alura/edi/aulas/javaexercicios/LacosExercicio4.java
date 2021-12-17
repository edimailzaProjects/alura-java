package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LacosExercicio4
{
    public static void main(String[] args)
    {
        int conjunto;
        double num1, num2, num3;
        double media;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Informe a quantidade de conjuntos: ");
            conjunto = scanner.nextInt();

            for (int i = 1; i <= conjunto; i++)
            {
                try
                {
                    System.out.println();
                    System.out.print("Informe o primeiro número do " + i + "º conjunto: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Informe o segundo número: " + i + "º conjunto: ");
                    num2 = scanner.nextDouble();
                    System.out.print("Informe o terceiro número: " + i + "º conjunto: ");
                    num3 = scanner.nextDouble();
                    System.out.println();
                    
                    if (num1 < num2 && num1 < num3)
                    {
                        if (num2 < num3)
                        {
                            System.out.println("A ordem dos números é: " + num1 + ", " + num2 + ", " + num3);
                        }
                        else
                        {
                            System.out.println("A ordem dos números é: " + num1 + ", " + num3 + ", " + num2);
                        }
                    }
                    else if (num2 < num1 && num2 < num3)
                    {
                        if (num1 < num3)
                        {
                            System.out.println("A ordem dos números é: " + num2 + ", " + num1 + ", " + num3);
                        }
                        else
                        {
                            System.out.println("A ordem dos números é: " + num2 + ", " + num3 + ", " + num1);
                        }
                    }
                    else
                    {
                        System.out.println("A ordem dos números é: " + num3 + ", " + num2 + ", " + num1);
                    }

                    media = (num1 + num2 + num3) / 3;
                    System.out.println();
                    System.out.printf("Soma do " + i + "º conjunto: %.2f \n", (num1 + num2 + num3));
                    System.out.println();
                    System.out.printf("Media do " + i + "º conjunto: %.2f \n", media);
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Dígito inválido.");
                }

            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Dígito inválido.");
        }
    }

}
