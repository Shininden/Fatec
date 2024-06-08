import java.util.Scanner;

public class Array_Fill3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double vector[] = new double[100];
        
        double x = sc.nextDouble();

        vector[0] = x;

        for (int i = 1; i < vector.length; i++) 
        {
            x /= 2;
            vector[i] = x;
        }

        for (int i = 0; i < vector.length; i++) 
        {
            System.out.printf("N[" + i + "] = %.4f", vector[i]);
            System.out.println();
        }

        sc.close();
    }
}