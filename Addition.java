public class Addition implements IOperation {
   private double number_one, number_two, result;
   
   public Addition(double number_one, double number_two) {
      this.number_one = number_one;
      this.number_two = number_two;
   }
   
   @Override
   public double performOperation() {
      result = number_one + number_two;
      return result;
   }
}