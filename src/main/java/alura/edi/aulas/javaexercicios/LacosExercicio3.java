package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LacosExercicio3
{
    public static void main(String[] args)
    {
        // Lista de exerc�cios da USP

        /*
         * Dado um n�mero n inteiro e positivo, dizemos que n � perfeito se n for igual � soma de seus divisores
         * positivos diferentes de n. Construa um programa em C que verifica se um dado n�mero � perfeito. Ex: 6 �
         * perfeito, pois 1+2+3 = 6.
         */

        int num;
        int total = 0;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um n�mero inteiro positivo: ");

        try
        {
            num = s.nextInt();

            System.out.println("Os divisores de " + num + " s�o:");

            for (int i = 1; i < num; i++)
            {
                if (num % i == 0)
                {
                    System.out.println(i);
                    total = total + i;

                }

            }
            
            System.out.println("e o pr�prio " + total);

            if (total == num)
            {
                System.out.println();
                System.out.println(num + " � um n�mero perfeito.");
            }
            else
            {
                System.out.println();
                System.out.println(num + " n�o � um n�mero perfeito.");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Meu fi, voc� sabe ler?");
        }

    }

}
