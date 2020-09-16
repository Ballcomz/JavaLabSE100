import java.util.Scanner;

public class HorT{
    public static void main(String[] args) {
        Scanner input = new scanner(System.in);
        
        int number1 = (int)(Math.random() * 10);
        System.out.print("Enter Guess number:")
        int number2 = input.nextInt();

        if (number1<number2)
        System.out.println("your number is to high, Try again");
        if (number1>number2)
        System.out.println("your number is to low,Try again")

    }
}