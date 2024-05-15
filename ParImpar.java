import javax.swing.JOptionPane;

public class ParImpar
{
    public static void main(String args[])
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));

        if(number % 2 == 0)
            JOptionPane.showMessageDialog(null, + number + " is an even number");
        else
            JOptionPane.showMessageDialog(null, + number + " is an odd number");
    }
}