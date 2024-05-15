//ler valor double, calcular e mostrar sua raiz quadrada e o valor ao cubo
import javax.swing.JOptionPane;

public class MathClass
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog("type a number"));
        double squareRoot = Math.sqrt(x);

        JOptionPane.showMessageDialog(null, "the square root is " + squareRoot);

        double power = Math.pow(x, 5);
        double result = Math.cbrt(power) + Math.sin(2 * x);
        double raizQuinta = Math.pow(x, 1.0/5);

        String saida = "raiz de " + x + " = " + squareRoot + "\n" + x + " a quinta potencia = " + power + "\nresultado grande = " + result + "\nraiz quinta de " + x + " = " + raizQuinta;

        JOptionPane.showMessageDialog(null, saida, "meus resultados", 1);
    }
}