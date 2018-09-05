import java.util.Scanner;
import java.math.BigInteger;

public class PrimeTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
    	System.out.println("Checking for Mersenne Primes \n");
    	System.out.print("Enter prime int x for 2^x-1  ===>> ");
		final int pwr = input.nextInt();
      Mersenne.evaluate(pwr);
      
      if (pwr==1)
         System.out.println("Is Not Prime nor Composite");
         
      if (pwr==2)
         System.out.println("Is Prime");
      
      else if (!possiblePrime.check(pwr))
         System.out.println("Is Not Prime");
         
      else
         LLCheck.check(pwr);
	}

}

