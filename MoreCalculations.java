import javax.swing.JOptionPane;

//get 3 random numbers, multiply the first one with the addittion of the other two  
public class MoreCalculations
{
    public static void main(String[] args)
    {
        double   n1,    n2,      n3;
        String n1_txt, n2_txt, n3_txt;

        n1_txt = JOptionPane.showInputDialog("type a number");
        n1 = Double.parseDouble(n1_txt);

        n2_txt = JOptionPane.showInputDialog("type another number");
        n2 = Double.parseDouble(n2_txt);

        n3_txt = JOptionPane.showInputDialog("type the final number");
        n3 = Double.parseDouble(n3_txt);

        JOptionPane.showMessageDialog(null, "the end resut is = " + (n1 * (n2 + n3)));
    }
}