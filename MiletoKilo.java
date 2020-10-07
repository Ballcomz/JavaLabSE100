public class MiletoKilo {
    public static void main(String[] args) {
      System.out.println("Miles\t\tKilometers\t|\tKilometers\tMiles");
      System.out.println("--------------------------------------------------------------------");
  
      double mile = 1; double kilometer = 20;
      for (int i = 1; i <= 10; mile++, kilometer += 5, i++) {
        System.out.println(mile + "\t\t" + String.format("%1$6.3f\t", mileToKilometer(mile)) + "\t|\t" + kilometer + "\t\t" + kilometerToMile(kilometer));
      }
    }
  
    public static double mileToKilometer(double mile) {
      return mile * 1.6;
    }
  
    public static double kilometerToMile(double kilometer) {
      return (5.0 / 8) * kilometer;
    }
  }