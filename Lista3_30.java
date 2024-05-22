import java.util.Scanner;

public class Lista3_30 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        /* Faça programas para calcular as seguintes sequencias:
        1 + 2 + 3 + 4 + 5 + ... + n
        (1 - 2) + (3 - 4) + (5 - 6) + ... + (2n - 1)
        1 + 3 + 5 + 7 + ... + (2n - 1) */

        System.out.print("Type a number ");
        int n = sc.nextInt();
        int soma = 0;

        System.out.println();

        for (int i = 1; i <= n; i++) 
        {
            soma += i;

            if(i != n)
                System.out.print(i + " + ");

            else
                System.out.print(i + " = " ); 
        }
        System.out.println(soma);

        soma = 0;
        
///////////////////////////////////////////////////////////////
        int contador = 1;
        while (contador <= (2 * n - 1)) 
        {
            soma += contador - (contador + 1);
            contador += 2;
        }
                    
        System.out.println(soma);

        soma = 0;
        contador = 1;
///////////////////////////////////////////////////////////////

        do 
        {
            if(contador % 2 != 0)
            {
                soma += contador;

                if(contador != (2 * n - 1))
                    System.out.print(contador + " + ");

                else
                    System.out.print(contador + " = " );
            } 
            contador++;
        } while (contador <= (2 * n - 1));


        System.out.println(soma);

        sc.close();
    }
}
