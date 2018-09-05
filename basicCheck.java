import java.util.ArrayList;

public class basicCheck
{
	public static int[] seivePrimes(boolean primes[], int mD)
	{
      primes[0]=false;
      primes[1]=false;
      for (int k=2; k<mD; k++)
         primes[k] = true;
      for (int k=2; k<=mD; k++)
      {
         if (primes[k]== true)
         {
            for (int a=2; a<=(primes.length-1)/k; a++)
               primes[a*k]=false;
         }
      }
      int numPrimes=0;
      for (int a=0; a<primes.length; a++)
      {
         if (primes[a]==true)
      		numPrimes++;
      }
      int[] listOfPrimes = new int[numPrimes];
      int c=0;
      for (int b=0; b<primes.length; b++)
      {
      	if (primes[b]==true)
      	{
      		listOfPrimes[c]=b;
            c++;
      	}
      }
      
      return listOfPrimes;      
   }
   
   
   public static boolean checkPrimeWithSeive(int[] x, double y, int mD)
   {      
      int numFactors=0;
      for (int d=0; d<x.length; d++)
      {
         if(x[d]<mD)
         {
            if(y%x[d]==0)
         	   numFactors++;
         }
      }
       if (numFactors==0)
         return true;
       else 
       	return false;  
   }
   
}