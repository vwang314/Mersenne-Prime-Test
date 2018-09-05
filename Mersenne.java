import java.math.BigInteger;

public class Mersenne
{
	public static void evaluate(int x)
	{
      BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger primeLarge = (two.pow(x)).subtract(one);
      System.out.println("2^"+x+"-1 = "+primeLarge);
      System.out.println("");
   }
}
