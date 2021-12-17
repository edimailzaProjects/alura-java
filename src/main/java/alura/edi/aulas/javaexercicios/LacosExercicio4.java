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
                    System.out.print("Informe o primeiro n�mero do " + i + "� conjunto: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Informe o segundo n�mero: " + i + "� conjunto: ");
                    num2 = scanner.nextDouble();
                    System.out.print("Informe o terceiro n�mero: " + i + "� conjunto: ");
                    num3 = scanner.nextDouble();
                    System.out.println();
                    
                    if (num1 < num2 && num1 < num3)
                    {
                        if (num2 < num3)
                        {
                            System.out.println("A ordem dos n�meros �: " + num1 + ", " + num2 + ", " + num3);
                        }
                        else
                        {
                            System.out.println("A ordem dos n�meros �: " + num1 + ", " + num3 + ", " + num2);
                        }
                    }
                    else if (num2 < num1 && num2 < num3)
                    {
                        if (num1 < num3)
                        {
                            System.out.println("A ordem dos n�meros �: " + num2 + ", " + num1 + ", " + num3);
                        }
                        else
                        {
                            System.out.println("A ordem dos n�meros �: " + num2 + ", " + num3 + ", " + num1);
                        }
                    }
                    else
                    {
                        System.out.println("A ordem dos n�meros �: " + num3 + ", " + num2 + ", " + num1);
                    }

                    media = (num1 + num2 + num3) / 3;
                    System.out.println();
                    System.out.printf("Soma do " + i + "� conjunto: %.2f \n", (num1 + num2 + num3));
                    System.out.println();
                    System.out.printf("Media do " + i + "� conjunto: %.2f \n", media);
                }
                catch (InputMismatchException e)
                {
                    System.out.println("D�gito inv�lido.");
                }

            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("D�gito inv�lido.");
        }
    }

}
