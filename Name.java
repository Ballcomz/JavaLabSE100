import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
       //Declare and assign variable in string type
        String name;
        String nickName = "ball";

        //Read the String by scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();

        //Print the data in String
        System.out.println("Your name is "+name);
        System.out.println("Your nick name is "+nickName);
    }
    
}
