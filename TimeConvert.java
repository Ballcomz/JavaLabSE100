/**
 * TimeConvert
 */
import java.util.*;
public class TimeConvert {

    public static void main(String[] args) {
        int sec;
        int day;
        int hour;
        int min;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of second: ");
        sec = input.nextInt();
        day = sec/86400;
        sec = sec%86400;
        hour = sec/3600;
        sec = sec%3600;
        min = sec/60;
        sec = sec%60;


        System.out.println("Answer is "+day+" day "+hour+" hour "+min+" minute "+sec+" second ");
    }
}