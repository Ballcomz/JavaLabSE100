import java.util.*;
public class ConvertMoney {
    public static void main(String[] args) {
        double bath,dollar;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter US Dollar: ");
        dollar = input.nextDouble();
        bath = dollar*31.8245;
    //1234567899
        System.out.println("Money "+dollar+" Dollar is "+bath+" Bath");

    }
    
}
