package Semester1;
import javax.swing.JOptionPane;

public class PositivoNegativo
{
    public static void main(String args[])
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));

        if(number >= 0)
            JOptionPane.showMessageDialog(null, + number + " is positive");
        else
            JOptionPane.showMessageDialog(null, + number + " is negative");
    }
}