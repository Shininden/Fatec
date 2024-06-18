package Semester1;
import javax.swing.JOptionPane;

public class ParaContinua
{
    public static void main (String[] args)
    {
        String option = JOptionPane.showInputDialog("Type \"continue\" to continue or any other key to stop the procedure: "); 

        while (option.equalsIgnoreCase("continue"))
            option = JOptionPane.showInputDialog("Stop or continue the procedure: ");
    }
}