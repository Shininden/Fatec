import java.util.Scanner;

public class Square 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        while (size < 3 || size > 20) 
        {
            System.out.println("Invalid Number");
            size = sc.nextInt();
        }

        for (int i = 0; i < size; i++) 
            System.out.print("* ");

        System.out.println();

        for (int i = 0; i < size - 2; i++) 
        {
            System.out.print("* ");

            for (int j = 1; j < size; j++) 
                System.out.print(" ");
            
            System.out.print(" *");
            System.out.println();
        }

        for (int i = 0; i < size; i++) 
            System.out.print("* ");

        sc.close();
    }
}