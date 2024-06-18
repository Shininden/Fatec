package Semester1;
import java.util.Scanner;

public class Lista4_21 
{
    public static void main(String[] args) 
    {
        /*programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros cada. 
        Crie um novo vetor denominado C calculando C = A- B. 
        Mostre na tela os dados do vetor C */
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) 
        {
            System.out.print("Type the " + (i+1) + " value of vector A: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println();

        for (int j = 0; j < vetorB.length; j++) 
        {
            System.out.print("Type the " + (j+1) + " value of vector B: ");
            vetorB[j] = sc.nextInt();
        }

        System.out.println();

        for (int k = 0; k < vetorC.length; k++) 
        {
            vetorC[k] = vetorA[k] - vetorB[k];
            System.out.print(vetorC[k] + " ");
        }

        sc.close();
    }
}