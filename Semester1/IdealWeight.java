package Semester1;
import javax.swing.JOptionPane;

public class IdealWeight
{
    public static void main(String args[])
    {
        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height"));
        String gender = JOptionPane.showInputDialog(null, "Are you a man or a woman?");

        if(gender.equalsIgnoreCase("man"))
            JOptionPane.showMessageDialog(null, "Your ideal weight is: " + ((72.7 * height) - 58));
        else
            JOptionPane.showMessageDialog(null, "Your ideal weight is: " + ((62.1 * height) - 44.7));
    }
}