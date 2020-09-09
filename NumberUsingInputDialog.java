import javax.swing.JOptionPane;

public class NumberUsingInputDialog {
    public static void main(String[] args) {
        // input for a and b
        String intString1 = JOptionPane.showInputDialog(null,"Enter value a:","Number",JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(intString1);

        String intString2 = JOptionPane.showInputDialog(null,"Enter value b:","Number",JOptionPane.QUESTION_MESSAGE);
        int b = Integer.parseInt(intString2);
        //Create String output
        String outString = "The result of a+b is "+(a+b);
        //Display output in GUI
        JOptionPane.showMessageDialog(null,outString);

    }
    
}
