import java.util.Scanner;

public class Lista3_28
{
    public static void main(String[] args) 
    {
        /* Faça um programa que leia um valor N inteiro e positivo, calcule o mostre o valor E, conforme a fórmula a seguir

        E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N! */
        Scanner sc = new Scanner(System.in);

        System.out.println("type an integer, positive number");
        int n = sc.nextInt();

        double e = 1;

        if(n < 0 || n == 0)
            System.out.println("Invalid Number");


        for (int i = 1; i <= n; i++) 
            e += (1 / setFatorialValue(i));


        System.out.printf("E = %.2f", e);


        sc.close();
    }

    static double setFatorialValue(double number)
    {
        double last_value = 1;

        for (double c = number; c > 1; c--) 
            last_value *= c;

        return last_value;
    }
}