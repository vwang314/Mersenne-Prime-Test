import java.math.BigInteger;

public class LLCheck
{
	public static void check(int x)
	{
      BigInteger s = new BigInteger("4");
      BigInteger two = new BigInteger("2");
      BigInteger one = new BigInteger("1");
      BigInteger zero = new BigInteger("0");
      BigInteger prime;
      prime = (two.pow(x).subtract(one));
      for (int k=1; k<=x-2; k++)
      {
         s = ((s.multiply(s)).subtract(two)).mod(prime);
      }
      
      if (s.equals(zero))
         System.out.println("Is Prime");
      else
         System.out.println("Is Not Prime");
   }
   
}
      
      
      
      
      
