import java.util.Scanner;
import java.util.Arrays;

public class Highest_and_Position 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];
        int highest = 0, highestPos = 0;

        for (int i = 0; i < vector.length; i++) 
        {
            vector[i] = sc.nextInt();

            if(highest < vector[i])
            {
                highest = vector[i];
                highestPos = i+1;
            }  
        }

        Arrays.sort(vector);
        System.out.println(vector[4]);
        System.out.println(highestPos);

        sc.close();
    }
}