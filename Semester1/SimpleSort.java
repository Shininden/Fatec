package Semester1;
import java.util.Scanner;
import java.util.Arrays;

public class SimpleSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] vector = new int[3];
        vector[0] = n1;
        vector[1] = n2;
        vector[2] = n3;

        Arrays.sort(vector);

        for (int i : vector) 
            System.out.println(i);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
    }
}