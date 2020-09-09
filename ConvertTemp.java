import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConvertTemp{
    public static void main(String[] args) {
        char menu;
        String string = JOptionPane.showInputDialog(null,"Enter input c(f->c), f(c->f)","Convert Temperature menu",JOptionPane.QUESTION_MESSAGE);
        char input = string.charAt(0);

        if (input == 'c'){
            String temp = JOptionPane.showInputDialog(null,"Enter Temperature in F",JOptionPane.QUESTION_MESSAGE);
            double f = Double.parseDouble(temp);
            double c = ((f-32)*5)/9;
            String output = "The convert of "+f+"F is "+c+"C";
            JOptionPane.showMessageDialog(null,output);
        }
        else if(input =='f'){
            String temp = JOptionPane.showInputDialog(null,"Enter Temperature in C",JOptionPane.QUESTION_MESSAGE);
            double c = Double.parseDouble(temp);
            double f = ((9*c)/5)+32;
            String output = "The convert of "+c+"C is "+f+"F";
            JOptionPane.showMessageDialog(null,output);
        }
        else
        JOptionPane.showMessageDialog(null,"Sorry input is invalid");  
    }
}