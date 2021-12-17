package alura.edi.aulas.java;

public class SwitchCaseMes
{
    public static void main(String[] args)
    {
        int mes = 123;

        if (mes >= 1 && mes <= 12)
        {
            switch (mes)
            {
            case 2:
                System.out.println("Fevereiro");
                break;

            default:
                System.out.println("Outro mês");
                break;
            }

        }
        else
        {
            System.out.println("Mes inválido.");
        }

    }

}
