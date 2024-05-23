import java.util.Scanner;

public class Lista4_27 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) 
        {
            System.out.print("Type the " + (i+1) + " value: ");
            nums[i] = scan.nextInt();
        }

        for(int j = 0; j < nums.length; j++)
        {

            if(ePrimo(nums[j]))
                System.out.println("The number " + nums[j] + " is prime and it's in the position " + (j+1));
                
        }
        scan.close();
    }

    private static boolean ePrimo(int num) 
    {
        if(num == 2)
            return true;

        else if(num == 1)
            return false;

        for(int k = 2; k < num; k++)
        {
            if(num % k == 0)
                return false;
        }
        return true;
    }
}