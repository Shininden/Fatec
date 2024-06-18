package Semester1;
import java.util.Scanner;

public class PUM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int index = 1, number = 1, limite = 4;

        for (int i = 0; i < n; i++) 
        {
            while (index < limite) 
            {
                System.out.print(number + " ");
                number++;
                index++;
            }
            number += 1;
            index = 1;

            System.out.print("PUM");
            System.out.println();
        }

        sc.close();
    }
}
