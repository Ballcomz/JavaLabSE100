import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sorting{
    public static void main(String[] args) {
        int num1,num2,num3,temp;

        String num = JOptionPane.showInputDialog(null,"Enter the num1",JOptionPane.QUESTION_MESSAGE);
        num1 = Integer.parseInt(num);
        num = JOptionPane.showInputDialog(null,"Enter the num2",JOptionPane.QUESTION_MESSAGE);
        num2 = Integer.parseInt(num);
        num = JOptionPane.showInputDialog(null,"Enter the num3",JOptionPane.QUESTION_MESSAGE);
        num3 = Integer.parseInt(num);

        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2>num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        String output = ("Soting number ->"+num1+" "+num2+" "+num3);
        JOptionPane.showMessageDialog(null,output); 
    }
}