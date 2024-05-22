import java.util.Arrays;
import java.util.Scanner;

public class Lista4_12 
{
    public static void main(String[] args) 
    {
        /*Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos 
        juntamente com o maior, o menor e a média dos valores. */
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int soma = 0;

        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print("Type the " + (i+1) + " value: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) 
            System.out.print(numbers[i] + " ");        

        Arrays.sort(numbers);
        System.out.println("The biggest is: " + numbers[4]);
        System.out.println("The smallest is: " + numbers[0]);

        for (int i = 0; i < numbers.length; i++) 
            soma += numbers[i];

        System.out.println("The average is: " + soma / 5);

        sc.close();
    }
}