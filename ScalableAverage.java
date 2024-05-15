import java.util.Scanner;

public class ScalableAverage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int accumulatedValues = 0, tot_Of_Numbers = 0, number = 0;

        do 
        {
            System.out.println("Type your values, the number '0' ends the procedure: ");
            number = sc.nextInt();    

            if(number != 0)
            {
                accumulatedValues += number;
                tot_Of_Numbers++;
            }

        } while (number != 0);

        if(tot_Of_Numbers == 0)
            System.out.println("The list is empty");
        else
            System.out.printf("The average is: %.2f", ((double) accumulatedValues / tot_Of_Numbers));
        
        sc.close();
    }   
}