package alura.edi.aulas.java;

import java.util.Scanner;

public class GaussSomatoria
{
    public static void main(String[] args)
    {
        int contador=0;
        int total = 0;
        int valor;
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor da soma: ");
        valor = input.nextInt();

        while (contador <= valor)
        {
            total += contador;
            contador++;

        }

        System.out.println("O total é: " + total);
    }

}
