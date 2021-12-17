package alura.edi.aulas.java;

public class LacoFor
{
    public static void main(String[] args)
    {
        int cont = 4;
        int total = 0;

        for (int i = 0; i <= cont; i++)
        {
            System.out.println(i);
            total += i;
        }

        System.out.println(total);
    }

}
