import java.util.ArrayList;

public class Euler5
{
   static double multiple;
   static ArrayList <Double> multiples = new ArrayList<Double>();

   public static void main (String [] args)
   {
      for(int a = 2520;a<5000; a++)//for ethvert tal
      {
         for(double i = 1;i<=20;i++)
         {
            multiple = a/i;
            if(multiple%1 == 0)
            {
               multiples.add(multiple);
            }
         }
         if(multiples.size()==10)
         {
            System.out.println(a);
            System.out.println(multiples.toString());
         }
         else
         {
            multiples.clear();
         }
      }
   }
}

/* Matematisk løsning:
This does not require programming at all. Compute the prime factorization of each number from 1 to 20, and multiply the greatest power of each prime together:

20 = 2^2 * 5
19 = 19
18 = 2 * 3^2
17 = 17
16 = 2^4
15 = 3 * 5
14 = 2 * 7
13 = 13
11 = 11

All others are included in the previous numbers.

ANSWER: 2^4 * 3^2 * 5 * 7 * 11 * 13 * 17 * 19 = 232 792 560
*/