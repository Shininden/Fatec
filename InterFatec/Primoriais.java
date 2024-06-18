package InterFatec;
import java.util.Scanner;

public class Primoriais 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number");
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; result < n; i++) 
        {
            if( (i % 1 == 0) && (i % i == 0) && (i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) &&  (i % 7 != 0)  || i == 2 || i == 3 || i == 5 || i == 7)
            { 
                for (int j = 1; result < n; j++) 
                {
                    if( j % 1 == 0 && j % j == 0 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0 || j == 2 || j == 3 || j == 5 || j == 7)
                    {
                        i *= j;
                        result = i;
                    }
                }
            }
        }

        if(result == n)
            System.out.println("S");
        else
            System.out.println("N");


        sc.close();
    }
}