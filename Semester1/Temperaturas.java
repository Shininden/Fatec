package Semester1;
//Ler uma temperatura em graus Celsius, convertê-la para Fahrenheit e exibir o resultado
import java.util.Scanner;

public class Temperaturas 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        double f, c;

        System.out.print("Digite a temperatura em Celsius: "); 
        c = sc.nextDouble();
        
        f = 9.0/5.0 * c + 32;

        System.out.println("A temperatura em Fahrenheit é: " + f);
        sc.close();
    }
}