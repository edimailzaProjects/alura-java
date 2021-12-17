package alura.edi.aulas.java;

public class TabuadaDuploLacoFor
{
    public static void main(String[] args)
    {
        for (int mult = 0; mult <= 10; mult++)
        {
            System.out.println();
            System.out.println("Tabuada do " + mult);
            System.out.println();
            for (int cont = 0; cont <= 10; cont++)
            {
                System.out.println(mult + " x " + cont + " = " + mult * cont);
            }
        }
    }

}
