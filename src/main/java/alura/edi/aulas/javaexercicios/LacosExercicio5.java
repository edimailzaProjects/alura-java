package alura.edi.aulas.javaexercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LacosExercicio5
{
    public static void main(String[] args)
    {
        /*
         * Lista de exerc�cios da USP Fa�a um programa que leia v�rios inteiros positivos e mostre, no final, a soma dos
         * n�meros pares e a soma dos n�meros �mpares. O programa para quando entrar um n�mero maior que 1000.
         */
        int digitos;
        int numero;
        int par = 0;
        int impar = 0;
        int somaPar = 0;
        int somaImpar = 0;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        try
        {
            System.out.println("Informe a quantidade de d�gitos: ");
            digitos = s.nextInt();

            for (int i = 0; i < digitos; i++)
            {
                System.out.println("Informe um n�mero: ");
                numero = s.nextInt();

                if (numero >= 1000)
                {
                    System.out.println("Voc� saiu do programa.");
                }
                    try
                    {
                        if (numero % 2 == 0)
                        {
                            par = numero;
                            somaPar += par;
                        }
                        else
                        {
                            impar = numero;
                            somaImpar += impar;
                        }

                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("D�gito inv�lido");
                    }
                }
            System.out.println("A soma dos numeros pares: " + somaPar);
            System.out.println("A soma dos numeros impares: " + somaImpar);

            
        }
        catch (InputMismatchException e)
        {
            System.out.println("D�gito inv�lido");
        }

    }

}
