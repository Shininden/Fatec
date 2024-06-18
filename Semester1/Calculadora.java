package Semester1;
import javax.swing.JOptionPane;

public class Calculadora
{
    public static void main(String[] args)
    {
        double number1 = 0, number2 = 0;
        char option = JOptionPane.showInputDialog(null, "Pick one of these calculations: (+, -, *, /), press 'E' to exit").charAt(0);

        while(option != 'E' && option != 'e')
        {
            if(option == '+' || option == '-' || option == '*' || option == '/')
            {
                number1 = Double.parseDouble(JOptionPane.showInputDialog("type the first number"));
                number2 = Double.parseDouble(JOptionPane.showInputDialog("type the second number"));
            }
    
            switch(option)
            {
                case '+':
                    JOptionPane.showMessageDialog(null, "Sum = " + (number1 + number2));
                    break;
    
                case '-':
                JOptionPane.showMessageDialog(null, "Minus = " + (number1 - number2));
                    break;
    
                case '*':
                    JOptionPane.showMessageDialog(null, "Mutiplication = " + (number1 * number2));
                    break;
    
                case '/':
                    if(number2 != 0.0)
                        JOptionPane.showMessageDialog(null, "Division = " + (number1 / number2));
                    else
                        JOptionPane.showMessageDialog(null, "It's not possible to divide a number by 0");
                    break;
    
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
            }
            
            option = JOptionPane.showInputDialog(null, "Pick one of these calculations: (+, -, *, /), or E to exit").charAt(0);
        }
    }
}