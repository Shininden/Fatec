package Semester1;
import java.util.Scanner;

public class LeNumeros 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int   int1, int2, int3;
        double db1, db2, db3;

        //Entrada de Dados
        System.out.print("Digite o primeiro inteiro: ");
        int1 = sc.nextInt();
        System.out.print("Digite o segundo inteiro: ");
        int2 = sc.nextInt();

        //Processamento
        int3 = int1 * int2;

        //Saída 
        System.out.println(int1 + " * " + int2 + " = " + int3);
        
        //Entrada de Dados com casas decimais
        System.out.print("Digite o primeiro decimal: ");
        db1 = sc.nextDouble();
        System.out.print("Digite o segundo decimal: ");
        db2 = sc.nextDouble();

        //Processamento
        db3 = db1 * db2;

        //Saída
        System.out.println(db1 + " * " + db2 + " = " + db3);

        sc.close();
    }
}