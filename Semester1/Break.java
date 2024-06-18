package Semester1;
import javax.swing.JOptionPane;

public class Break
{
     static int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number and I'll show you its reversed form"));
     static int digit = 0;

    public static void main(String[] args)
    {
        secondWay();
    }

    static void firstWay()
    {
        int auxilary_var = number;
        double power = 0;
        
        //Getting how many decimal houses the given number has
        while(auxilary_var > 0)
        {
            auxilary_var /= 10;
            power++;
        }

        JOptionPane.showMessageDialog(null, "\nThe reversed form of " + number + " is: ");

        while(number > 0)
        {
            digit += (number % 10) * Math.pow(10, power - 1);  

            power--;
            number /= 10;
        }
        JOptionPane.showMessageDialog(null, digit);
    }



    static void secondWay()
    {
        int inverted_Number = 0;
        JOptionPane.showMessageDialog(null, "\nThe reversed form of " + number + " is: ");

        while(number > 0)
        {
            digit = number % 10;  
            inverted_Number = inverted_Number * 10 + digit;
            number /= 10; 
        }
        JOptionPane.showMessageDialog(null, inverted_Number);
    }
}