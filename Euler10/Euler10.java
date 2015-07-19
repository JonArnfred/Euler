/* 
   To metoder der finder summen af alle primtal under et givent tal.
*/

public class Hastighed
{
	private final static int NUMBERS_BELOW = 10000;
   private static double sum;
   private static double sum1;
   private static long startTime;
   private static long endTime;
   
	public static void main(String args[])
   {
      startTime = System.nanoTime();
		for (int i = 2; i < NUMBERS_BELOW; i++)
      {
			if (isPrime(i) == true)
         {
				sum += i;
			}
		}
      System.out.println("isPrime() found the sum to be: "+sum+" and the calculation took approximately:");
      timing();
      
      startTime = System.nanoTime();
		for (int i = 2; i < NUMBERS_BELOW; i++)
      {
			if (isPrimeSgrt(i) == true)
         {
				sum1 += i;
			}
		}
      System.out.println("isPrimeSqrt() found the sum to be: "+sum+" and the calculation took approximately:");
      timing();
   }
   

	public static boolean isPrime(int n)
   {  
		for (int j = 2; j < n; j++)
      {
			if (n % j == 0)
				return false;
		}
		return true;
   }
   
   public static boolean isPrimeSgrt(int n)
   {  
		for (int j = 2; j < Math.sqrt(n); j++)
      {
			if (n % j == 0)
				return false;
		}
		return true;
   }
   
   public static void timing(){
   
   endTime = System.nanoTime();
   long duration = endTime - startTime;
   System.out.println((double)duration / 1000000000.0+" seconds\n");
   
   }
}
 


