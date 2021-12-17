package alura.edi.aulas.java;

public class DoublesFloat
{
    public static void main(String[] args)
    {

        System.out.println("DOUBLE");

        double salario = 1.99;
        System.out.println("Padr�o: ...R$" + salario);

        // um inteiro cabe dentro de um double

        double salario0 = 1;
        System.out.println("Vai sempre mostrar o resultado com decimal: ...R$" + salario0);

        double salario1 = 1.0 / 2;
        System.out.println("Se tem o separador ponto divide correto: ...R$" + salario1);

        double salario_1 = 1 / 2;
        System.out.println("Resultado arredonda pra zero se n�o tem ponto: ...R$" + salario_1);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

        System.out.println("FLOAT");

        float salario2 = 1;
        System.out.println("Padr�o float: ...R$" + salario2);

        // Conversores s�o chamados de "casting"

        float salario3 = (float) 1.90;
        System.out.println("Precisa converter: ...R$" + salario3);

        float salario4 = (float) 1 / 2;
        System.out.println("Diferente do double, n�o arredonda pra zero: ...R$" + salario4);

        float pontoFlutuante = 3.14f; // outra forma de converter

        System.out.println(pontoFlutuante);

        // short valorPequeno = 2131;
        // byte b = 127;

    }

}
