package Exception;

import java.io.*;

public class InsufficientFundsException extends Exception{
   private double Amount;
   
   public InsufficientFundsException(double Amount)
   {
      this.Amount = Amount;
   } 
   public double getAmount()
   {
      return Amount;
   }
}