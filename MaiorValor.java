import javax.swing.JOptionPane;

public class MaiorValor
{
    public static void main(String args[])
    {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Type a number"));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Type another number"));

        if(number1 > number2)
            JOptionPane.showMessageDialog(null, + number1 + " is bigger than " + number2);

        else if(number1 == number2)
            JOptionPane.showMessageDialog(null, " both numbers are the same");
            
        else
            JOptionPane.showMessageDialog(null, + number2 + " is bigger than " + number1);
    }
}