import java.util.ArrayList;

public class Euler1
{
   public static void main (String []args)
   {
      int result = 0;
      for(int i = 1; i<1000; i++)
      {
         if(i%5 == 0||i%3 == 0)
         {
            result +=i;
         }
      }
      System.out.println(result);
   }
}