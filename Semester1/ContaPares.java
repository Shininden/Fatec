package Semester1;
import javax.swing.JOptionPane;

public class ContaPares
{
    public static void main(String[] args)
    {
        int evenNumbers = 0;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number, 0 ends the procedure"));

        while(number != 0)
        {
            number = Integer.parseInt(JOptionPane.showInputDialog("Type another number"));

            if(number % 2 == 0)
                evenNumbers++;
        }
        JOptionPane.showMessageDialog(null, "You typed: " + evenNumbers-- + " even numbers");
    }
}