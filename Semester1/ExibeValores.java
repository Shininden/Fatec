package Semester1;
import java.util.Scanner;

public class ExibeValores 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Type an integer number: ");
        int n = sc.nextInt();
        
        int index = 0;

        if(n >= 0)
        {
            do 
            {
                System.out.print(index + " "); 
                index++; 
            }while (index <= n);
        }
        else
        {
            do 
            {
                System.out.print(index + " "); 
                index--; 
            }while (index >= n);
        }
        sc.close();
    }
}
