package Semester2.Aula7;
import java.util.Scanner;

public class Ex3 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Choose your option, you can either pick, 1, 2 or 3");
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2 && choice != 3) 
        {
           System.out.println("Invalid value, Type again");
           choice = sc.nextInt();
        }

        switch (choice) 
        {
            case 1:
                metodo1();
                break;
        
            case 2:
                metodo2();
                break;

            case 3:
                metodo3();
                break;
        }


        sc.close();
    }

    static void metodo1()
    {
        int[] vetA = new int[5];
        System.out.println("Type 5 value");

        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.print("Sum of all even numbers multiples of 3: ");
        int soma = 0;

        for (int i = 0; i < vetA.length; i++) 
        {
            if(vetA[i] % 6 == 0){
                soma += vetA[i];
            }
        }

        System.out.println(soma);
    }

    static void metodo2()
    {
        int[] vetB = new int[4];
        int[] vetC = new int[vetB.length];
        int soma = 0;
        System.out.println("Type 5 value");

        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetB.length; i++) 
        {
            for (int j = 0; j <= vetB[i]; j++) 
            {
                vetC[i] += j;
            }
        }

        System.out.print("Vet B: ");
        for (int i : vetB) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nVet C: ");
        for (int i : vetC) {
            System.out.print(i + " ");
        }
    }

    static void metodo3()
    {
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print("Type the value of the pos ["+(i+1)+"] ["+(j+1)+"] of the matrix: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Showing Matrix");
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                if(i > j){
                    soma += matriz[i][j];
                }
            }
        }

        if (soma == 0) {
            System.out.println('V');
        }
        else{
            System.out.println('F');
        }
    }
}
