package Semester1;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeituraCaracteres
{
    public static void main (String[] args)
    {
        //Scanner
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Type anything");
        String s = sc.nextLine();

        System.out.println("The string's length is: " + s.length());
        System.out.println("The first letter is : " + s.charAt(0));
        System.out.println("The last letter is: " + s.charAt(s.length()-1));
        sc.close();*/

        //JOptionPane
        String j = JOptionPane.showInputDialog(null, "Type anything");
        JOptionPane.showMessageDialog(null, " the word " + j + " has " + j.length() + " characters");
        JOptionPane.showMessageDialog(null, "the last letter is: " + j.charAt(j.length()-1));
    }
}  