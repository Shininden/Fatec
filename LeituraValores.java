import javax.swing.JOptionPane;

public class LeituraValores
{
    public static void main(String[] args)
    {
        String auxilary_var;
        int number;

        //Segmented way to do it
        auxilary_var = JOptionPane.showInputDialog("type a number");
        number = Integer.parseInt(auxilary_var);

        //Direct way to do it
        int othernumber = Integer.parseInt(JOptionPane.showInputDialog("type another number"));
        JOptionPane.showMessageDialog(null, "the sum is = " + (number + othernumber));


        double x = Double.parseDouble(JOptionPane.showInputDialog("type a decimal number"));
        JOptionPane.showMessageDialog(null, "Three times this number is = " + 3 * x);
    }
}