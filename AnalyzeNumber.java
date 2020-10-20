public class AnalyzeNumber {
    public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      System.out.print("Enter the number of items: ");
      int n = input.nextInt(); 
      double[] numbers = new double[n]; // Create an array
      double sum = 0;
  
      System.out.print("Enter the numbers: ");
      for (int i = 0; i < n; i++) {
        numbers[i] = input.nextDouble();
        sum += numbers[i];
      }
      
      System.out.print("show all number in array:");//Show number in array
      for (int i = 0; i<n;i++)
      System.out.print(numbers[i]+" ");
      System.out.println("");
  
      double max = 0;
      double min = 9999999;
      for(int i = 0; i<n;i++){
          if (numbers[i]>max) //find max
          max = numbers[i];
          if (numbers[i]<min) // find min
          min = numbers[i];
      }
      System.out.println("Max number is: "+max);
      System.out.println("Min number is: "+min);

    }
  }