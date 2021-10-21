public class SimpleCalculator implements ICalculator {

   @Override
   public void calculate(IOperation operation) {
      if(operation == null) {
         throw new IllegalArgumentException("Operator is invalid!");
      }
      
      System.out.print(operation.performOperation());
   }
   
}