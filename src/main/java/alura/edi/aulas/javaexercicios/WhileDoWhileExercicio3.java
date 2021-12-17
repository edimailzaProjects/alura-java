package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileDoWhileExercicio3
{
    public static void main(String[] args)
    {
       
        int n3;
        int seq = 0;
        int n1 = 0;
        int n2 = 1;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        try
        {
            System.out.println("Informe a quantidade de números que você quer ver da sequencia de Fibonacci: ");
            seq = s.nextInt();

            System.out.print(n1 + " " + n2);

            //Fórmula: F = (F-1) + (F-2);
            for (int i = 2; i < seq; ++i)
            {
                n3 = n1 + n2;
                System.out.print(" " + n3); //passou a ser o último
                n1 = n2; // atualiza o valor do penultimo
                n2 = n3; // atualiza o valor do ultimo
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Dígito inválido");
        }
        
    }

}
