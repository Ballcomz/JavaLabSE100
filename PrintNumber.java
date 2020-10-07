import java.util.Scanner;
public class PrintNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            checknumber(j);
    }
    }
public static void checknumber(int x){
    if (x==1){
        System.out.println("1111");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println("");
    }
    
    else if (x==2){
        System.out.println("222222");
        System.out.println("    22");
        System.out.println("   22");
        System.out.println(" 22");
        System.out.println("222222");
        System.out.println("");
    }
    
    else if(x==3){
        System.out.println("333333");
        System.out.println("    33");
        System.out.println(" 33333");
        System.out.println("    33");
        System.out.println("333333");
        System.out.println("");
    }
    
    else if (x == 4){
        System.out.println("44   44");
        System.out.println("44   44");
        System.out.println("4444444");
        System.out.println("     44");
        System.out.println("     44");
        System.out.println("");
    }
    else {
        System.out.println("5555555");
        System.out.println("55     ");
        System.out.println("5555555");
        System.out.println("     55");
        System.out.println("5555555");
        System.out.println("");
}

}
}