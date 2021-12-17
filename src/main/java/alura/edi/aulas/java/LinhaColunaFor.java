package alura.edi.aulas.java;

public class LinhaColunaFor
{
    public static void main(String[] args)
    {
        // Matriz triangular
        for (int linha = 0; linha < 10; linha++)
        {
            for (int coluna = 0; coluna < 10; coluna++)
            {
                if (coluna > linha)
                    break;

                System.out.print("*");

            }
            System.out.println();
        }
    }

}
