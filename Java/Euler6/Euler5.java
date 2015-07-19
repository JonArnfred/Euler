import java.util.ArrayList;

public class Euler5
{
   static double multiple;
   static ArrayList <Double> multiples = new ArrayList<Double>();

   public static void main (String [] args)
   {
      for(int a = 2520;a<500000000; a++)//for ethvert tal
      {
         for(double i = 1;i<=20;i++)
         {
            multiple = a/i;
            if(multiple%1 == 0)
            {
               multiples.add(multiple);
            }
         }
         if(multiples.size()==20)
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