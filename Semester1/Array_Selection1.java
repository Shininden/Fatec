package Semester1;
import java.util.Scanner;

public class Array_Selection1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double vector[] = new double[5];

        for (int i = 0; i < vector.length; i++) 
            vector[i] = sc.nextDouble();

        for (int i = 0; i < vector.length; i++) 
        {
            if(vector[i] <= 10)
                System.out.println("A" + "[" + i + "]" + " = " + vector[i]);
        }
        sc.close();
    }
}