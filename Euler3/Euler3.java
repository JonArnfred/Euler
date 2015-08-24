import java.math.BigDecimal;

//Metoden finder den stoerste primtals faktorering af a.



public class Euler3
{
   public static void main (String [] args)
   {
      long a = 13195L;
      for(double i = 2; i <a; i++)
      {
         double result = a/i;
         
         //Tjekker om result er et heltal
         if (result%1 == 0)
         {
            //tjekker om result er et lige tal, hvis det er, er det ikke et primtal.
            if (result%2==0)
            {
               break;
            }
            //tjekker om result er et ulige primtal
            for(int b=3;i*i<=result;i+=2)
            {
               if(result%i==0)
               {
                  System.out.println(i);
               }
            }
          }
       }
    }
}
