import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Provide me a number");
        int n = sc.nextInt();

        int soma = 1;
        int halfway = n / 2;

        for (int i = 2; i <= halfway; i++) 
        {
            if(n % i == 0)
                soma += i;
        }
        
        if(soma == n)
            System.out.print(n + " is a perfect number");
        else
            System.out.print(n + " is not a perfect number");

        sc.close();
    }
}