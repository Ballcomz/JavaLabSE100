import java.util.Scanner;

public class Quadrant{
    public static void main(String[] args){
        // Create a Scanner
    Scanner input = new Scanner(System.in);
    // Receive an input
    System.out.print("Enter an degree: ");
    int degree = input.nextInt();

    if((degree>=0)&&(degree<=90))
    System.out.println("The degree"+degree+"is in I Quadrant");

    else if((degree>90)&&(degree<=180))
    System.out.println("The degree "+degree+" is in II Quadrant");

    else if((degree>180)&&(degree<=270))
    System.out.println("The degree"+degree+"is in III Quadrant");

    else if((degree>270)&&(degree<=360))
    System.out.println("The degree"+degree+"is in IV Quadrant");

    }
}