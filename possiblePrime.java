public class possiblePrime
{
	public static boolean check(int x)
	{
      int prime = (int)(Math.pow(2,x))-1;
      
      if (x==2)
         return true;
      
      if (3<x && x<31)
      {
         if (prime%6!=1 && prime%6!=5)
         {
            return false;
         }
      }
      
      if (x<Math.pow(2,28))
      {
         if(!less31.check(x))
            return false;
         else
            return true;         
      }
      else
         return true;
   }
   
}