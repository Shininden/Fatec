package Semester1;
import java.util.Scanner;
import java.util.Random;
public class Advinha
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sorteado = random.nextInt(100) + 1; //To make sure that the number will be 1-100 and not 0-99

        System.out.print("Guess a number btw 1 and 100: ");
        int guess = scanner.nextInt();

        int numberOfChances = 1;
        while(guess != sorteado && numberOfChances > 3)
        {
            if(guess > sorteado)
                System.out.print("um pouco menos: ");
            else
                System.out.print("um pouco mais: ");

            guess = scanner.nextInt();
            numberOfChances++;
        }

        if(guess == sorteado)
            System.out.println("A resposta esta E......xataaa!!!");
        else
            System.out.println("A resposta esta E......rrada!!!");

        scanner.close();
    }
}