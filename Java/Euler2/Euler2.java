import java.util.ArrayList;

//Problem: Find the sum of all equal fibonacci numbers less than 4 million

public class Euler2
{
   static int position = 0;
   
   static ArrayList <Integer> fibNumbers = new ArrayList<Integer>();
   static ArrayList <Integer> equalFibNumbers = new ArrayList<Integer>();
   
   public static void main (String []args)
   {
      fibNumbers.add(1);
      fibNumbers.add(2);
      
      //finds the fibonacci numbers below 4 mill
   
      for(int i = 0; i <4000000; i++)
      {
         if(i == fibNumbers.get(position) + fibNumbers.get(position+1))
         {
            fibNumbers.add(i);
            position++;
         }
      }
      System.out.println("number of f-numbers under 4m: "+fibNumbers.size());

       //finds the equal fibonacci numbers below 4 mill
      for(int i = 0; i<fibNumbers.size(); i++)
      {
      
         if(fibNumbers.get(i)%2 ==0)
         {
            equalFibNumbers.add(fibNumbers.get(i));
         }
      }
      
      System.out.println(equalFibNumbers.size());
      
      int result = 0;
      for(int i = 0; i< equalFibNumbers.size(); i++)
      {
         result +=equalFibNumbers.get(i);
      }
      System.out.println(result);
   }
}