/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13
 we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/
import java.util.ArrayList;

public class Euler7
{ 
   static ArrayList<Integer> primes = new ArrayList<Integer>();

   public static void main (String []args)
   {
      long startTime = System.nanoTime();//start an execution timer
      primes.add(2);
      for (int i = 3;;i =i+2)
      {
         primes.add(i);
         for(int a = 3;a*a<=i;a++)
         {
            if(i%a==0)
            {
               primes.remove((Integer)i);
            }
         }          
         if(primes.size()==10001)
         {
            System.out.println(primes.get(10000));
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("The method took: "+(double)duration / 1000000000.0+" seconds");
            break;
         }
      }
   }
}

            