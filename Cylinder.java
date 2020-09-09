import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        double area, radius, length, volume;
        final double PI = 3.1428;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter length: ");
        length = input.nextDouble();

        area = radius*radius*PI;
        volume = area*length;

        System.out.println("The volume of Cylinder is: "+volume);
    }
}