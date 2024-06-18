package Semester1;
public class Lista3_38
{
    public static void main(String[] args) 
    {
        int a = 0, b = 0, c = 0;
        boolean found = false;

        while (found == false) 
        {
            for (a = 1; a < (1000 / 3); a++) 
            {
                for (b = a; b < (1000 / 2); b++) 
                {
                    c = 1000 - a - b;

                    if ((a * a) + (b * b) == (c * c)) 
                        found = true;
                }
            }
        }
        
        if (found) 
        {
            System.out.println("O terno pitagórico e: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("O produto abc e: " + (a * b * c));
        } 

        else 
            System.out.println("Nenhum terno pitagórico encontrado.");
    }
}
