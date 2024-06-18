package InterFatec;

import javax.swing.JOptionPane;

public class BalasDumbinho 
{
    public static void main(String[] args) 
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("What's the code?"));
        int digit = 0;
        int soma = 0;

        while(number > 0)
        {
            digit = number % 10;  
            soma += digit;
            number /= 10; 
        }

        if(soma % 2 == 0)
            JOptionPane.showMessageDialog(null, "dumbinho");
        else
            JOptionPane.showMessageDialog(null, "8-bonito");
    }
}