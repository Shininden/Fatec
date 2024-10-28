package Semester2.Aula7;

public class Ex2 
{
    public static void main(String[] args) 
    {
        calcularSequencia(5, 2);
    }

    static void calcularSequencia(int n, int a)
    {
        double soma = 0;

        for (int i = 1; i <= n; i++) 
        {
            soma += (double) 1 / (i * a);

            if(i != n){
                System.out.print("1/"+ i*a + " + ");
            }   
            else{
                System.out.print("1/"+ i*a + " = " );
            } 
        }
        System.out.printf("%.2f", soma);
    }
}
