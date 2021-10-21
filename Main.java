import java.io.*;

public class Main extends SimpleCalculator {
   private double number_one = 15.20;
   private double number_two = 55.15;
   private double result = 0.00;
   
   public static void main(String[] args) {
      Addition testing = new Addition(15.00, 25.00);
      SimpleCalculator calculator = new SimpleCalculator();
      calculator.calculate(testing);
   }

}