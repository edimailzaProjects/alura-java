package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LacosExercicio3
{
    public static void main(String[] args)
    {
        // Lista de exercícios da USP

        /*
         * Dado um número n inteiro e positivo, dizemos que n é perfeito se n for igual à soma de seus divisores
         * positivos diferentes de n. Construa um programa em C que verifica se um dado número é perfeito. Ex: 6 é
         * perfeito, pois 1+2+3 = 6.
         */

        int num;
        int total = 0;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");

        try
        {
            num = s.nextInt();

            System.out.println("Os divisores de " + num + " são:");

            for (int i = 1; i < num; i++)
            {
                if (num % i == 0)
                {
                    System.out.println(i);
                    total = total + i;

                }

            }
            
            System.out.println("e o próprio " + total);

            if (total == num)
            {
                System.out.println();
                System.out.println(num + " é um número perfeito.");
            }
            else
            {
                System.out.println();
                System.out.println(num + " não é um número perfeito.");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Meu fi, você sabe ler?");
        }

    }

}
