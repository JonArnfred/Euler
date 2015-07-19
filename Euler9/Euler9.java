//without break: 0.022365
//with break: 0.016684
public class Euler9
{
   static int b;
   public static void main (String []args)
   {
      long startTime = System.nanoTime();//start an execution timer
      loop: for (int c = 499; c>=335;c--)
      {
         for(int a = 332; a>=3;a--)
         {
            b = 1000-a-c;
            if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))
           {
               System.out.println("A = "+a+", B = "+b+", C = "+c+"\nProduct: "+a*b*c);
               break loop;
           }
         }
      }
      long endTime = System.nanoTime();
      long duration = endTime - startTime;
      System.out.println("The method took: "+(double)duration / 1000000000.0+" seconds");

   }
}