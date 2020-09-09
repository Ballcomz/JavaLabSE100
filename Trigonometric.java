import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Trigonometric{
    public static void main(String[] args) {
        double d,answer;
        String string = JOptionPane.showInputDialog(null,"1.sine 2.cosine 3.tangent 4.hyp.sine 5.hyp.cosine 6.hyp.tan","Choose function",JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(string);
        
       switch (input){
            case 1: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.sin(d);
                String output = "Answer of sine "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;
            }
            case 2: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.cos(d);
                String output = "Answer of cosine "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;
            }
            case 3: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.sin(d);
                String output = "Answer of tangent "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;
            }
            case 4: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.sinh(d);
                String output = "Answer of hyperbolic sine "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;   
            }
            case 5: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.cosh(d);
                String output = "Answer of hyperbolic cosine "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;
            }
            case 6: {
                String angle = JOptionPane.showInputDialog(null,"Enter the degree",JOptionPane.QUESTION_MESSAGE);
                d = Double.parseDouble(angle);
                d = Math.toRadians(d);
                answer = Math.tanh(d);
                String output = "Answer of hyperbolic tangent "+angle+" degree is "+answer;
                JOptionPane.showMessageDialog(null,output); 
                break;
            }
            default : JOptionPane.showMessageDialog(null,"Sorry input is invalid"); 

    }
    
}}