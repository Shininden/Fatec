package Semester2;

import java.util.Random;
import java.util.Scanner;

public class PracticeForP1
{
    static Random rand = new Random();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        encherVet(matrix);
        print(matrix);
        System.out.println();
        verifiIdentity(matrix);
        sc.close();
    }

    static void encherVet(int[][] vet)
    {
        for (int i = 0; i < vet.length; i++)
        {
            for (int j = 0; j < vet[i].length; j++) {
                vet[i][j] = rand.nextInt(0,2);
            }
        }
    }

    static void print(int[][] vet)
    {
        for (int i = 0; i < vet.length; i++)
        {
            for (int j = 0; j < vet[i].length; j++) {
                System.out.print("[" + vet[i][j] + "] ");
            }
            System.out.println();
        }
    }

    static void verifiIdentity(int[][] matrix)
    {
        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(i == j)
                {
                    if(matrix[i][j] == 1){
                        ones++;
                    }
                }
                else
                {
                    if(matrix[i][j] == 0){
                        zeroes++;
                    }
                }
            }
        }

        if (ones == 3 && zeroes == 6){
            System.out.println("É identidade");
        }
        else{
            System.out.println("Não é");
        }
    }
}