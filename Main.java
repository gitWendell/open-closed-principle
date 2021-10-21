import java.io.*;
import java.util.Scanner;

public class Main extends SimpleCalculator {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      SimpleCalculator calculator = new SimpleCalculator();
      
      System.out.print("Enter number: ");
      double number_one = input.nextDouble();
      
      System.out.print("Enter number: ");
      double number_two = input.nextDouble();
      
      Addition testing = new Addition(number_one, number_two);
      calculator.calculate(testing);
   }
}