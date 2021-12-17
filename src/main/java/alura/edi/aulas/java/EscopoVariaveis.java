package alura.edi.aulas.java;

public class EscopoVariaveis
{
    public static void main(String[] args)
    {
        System.out.println("Variaveis locais");
        System.out.println("");

        boolean foiPromovido = false;
        double salario = 8000.0;

        if (foiPromovido)
        {
            double aumentaSalario = 4200.0;
            salario = salario + aumentaSalario;
        }
        else
        {
            System.out.println("Se esforce mais");
        }

        System.out.println("Seu salário é: " + salario);
    }

}
