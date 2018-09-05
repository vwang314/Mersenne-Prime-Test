public class less31
{
	public static boolean check(int x)
	{
      int prime = x;
      
      if (x>3 && prime%6!=1 && prime%6!=5)
      {
         return false;
      }
      
      else
      {
         int maxDivisor = (int)(Math.pow(prime,0.5))+1;
    	   boolean primes[] = new boolean[maxDivisor+1];
         int[] listOfPrimes = basicCheck.seivePrimes(primes, maxDivisor);
         if(!basicCheck.checkPrimeWithSeive(listOfPrimes, prime, maxDivisor))
            return false;
         else
            return true;
      }
      
   }
}