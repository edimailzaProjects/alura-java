package alura.edi.aulas.javaexercicios;

import java.util.Scanner;

import alura.edi.aulas.java.IfElseExercicio4Exception;

public class IfElseExercicio4
{
    public static void main(String[] args) throws IfElseExercicio4Exception
    {
        // Exceptions personalizadas

        String sexo;

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu gênero F para feminino ou M para Masculino: ");
        sexo = input.nextLine();

        if (!sexo.contentEquals("M") && !sexo.contentEquals("m") && !sexo.contentEquals("F")
                && !sexo.contentEquals("f"))
        {

            throw new IfElseExercicio4Exception("Entrada invalida, valores suportados: F ou M.");
        }

        System.out.print(sexo);
        if (sexo.contentEquals("M") || sexo.contentEquals("m"))
        {
            System.out.print(": gênero Masculino");
        }

        else if (sexo.contentEquals("F") || sexo.contentEquals("f"))
        {
            System.out.print(": gênero Feminino");
        }

    }

}
