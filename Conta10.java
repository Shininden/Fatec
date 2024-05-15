import javax.swing.JOptionPane;

public class Conta10
{
    public static void main(String[] args)
    {
        int cont = 1;

        while(cont <= 10)
        {
            JOptionPane.showMessageDialog(null, cont);
            cont++;
        }
    }
}