import javax.swing.JOptionPane;

public class EntradaJanelinha
{
    public static void main(String[] args)
    {
        String word = JOptionPane.showInputDialog("type hi");

        JOptionPane.showMessageDialog(null, "you typed " + word);
    }
}