package InterFatec;

import java.util.Scanner;

public class NumerosAmigos 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number");
        int n1 = sc.nextInt();

        int soma = 0;
        int aux = 0;
        int numeroDeContas = 0;

        for (int i = 1; i < n1; i++) 
        {
            if(n1 % i == 0)
                soma += i;
        }
        numeroDeContas++;


        while(soma != n1 && numeroDeContas < 15)
        {
            for (int j = 1; j < soma; j++) 
            {
                if(soma % j == 0)
                    aux += j;     
            }

            soma = aux;
            aux = 0; 
            numeroDeContas++;
        }

        if(soma == n1 && (numeroDeContas > 2 && numeroDeContas < 15))
            System.out.println("s");
        else
            System.out.println("n");
        
        sc.close();
    }
}