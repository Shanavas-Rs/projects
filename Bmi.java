import java.util.*;
public class Bmi {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nInput height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
      if(BMI<18.5)
      {
          System.out.println("  Underweight ");
      }
      else if(BMI<=24.9)
      {
          System.out.println("  Normal ");
      }
      else if(BMI<=29.9)
      {
          System.out.println(" Overweight ");
      }
      else
      {
          System.out.println("   Obese ");
      }
   }
}