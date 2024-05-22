import java.util.Scanner;

public class Lista4_27 
{
    public static void main(String[] args) 
    {
        /*Leia 10 numeros inteiros e armazene em um vetor. 
        Em seguida escreva os elementos que sao primos e suas respectivas posiçoes no vetor. */
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print("Type the " + (i+1) + " value: ");
            numbers[i] = sc.nextInt();
        }

        for (int j = 0; j < numbers.length; j++) 
        {
            if((numbers[j] % 1 == 0) && (numbers[j] % numbers[j] == 0) && (numbers[j] % 2 != 0) && (numbers[j] % 3 != 0) && (numbers[j] % 5 != 0) && (numbers[j] % 7 != 0)  || numbers[j] == 2 || numbers[j] == 3 || numbers[j] == 5 || numbers[j] == 7)
                System.out.print("\nThe number " + numbers[j] + " is prime and it's in the position " + (j+1));
        }

        sc.close();
    }   
}