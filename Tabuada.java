import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tabuada
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {



        sc.close();
    } 

    static void showAllTables()
    {
        for (int i = 1; i <= 10; i++) 
        {
            String saida = "";

            for (int j = 0; j <= 10; j++) 
            {
                saida += String.format("%2d", i) + " x " + 
                         String.format("%2d", j) + " = " + 
                         String.format("%3d", i*j) + "\n";
            }

            JOptionPane.showMessageDialog(null, saida, "Tabuada do " + i, JOptionPane.PLAIN_MESSAGE);
        }
    }

    static void show_Specific_Table()
    {
        System.out.println("Digite um valor pra tabuada: ");
        int n = sc.nextInt(); 
        int i = 0;

        while(i <= 10)
        {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }       
    }
}