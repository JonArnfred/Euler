import java.util.*;

public class Euler4
{
   static double result;
   static ArrayList<Double> numbers = new ArrayList <Double>();
   static ArrayList<Double> palindroms = new ArrayList<Double>();
   static ArrayList<Double> results = new ArrayList <Double>();
   
   public static void main (String []args)
   {
      palindrome(999999);
   }
   
   public static void palindrome(double d)
   {
      for(int a = 0; a<d;a++)
      {
         String original = String.valueOf(numbers.get(a));//laver en String af en Double
         int length = original.length();//får længden af Stringen
         String reverse="";//laver en tom String reverse
         
         for (int i = length - 1 ; i >= 0 ; i-- )
         {
            reverse = reverse + original.charAt(i);//lægger Strigen original baglæns over i reverse
            if (original.equals(reverse))//Hvis palindrom
            {
               Double palindrom = Double.parseDouble(original);//parser den tilbage til Double
               palindroms.add(palindrom);//adder til ArrayListen af Palindroms
            }
         }
      }
   System.out.println(numbers.toString());
   }
   
   
   
   public static void compute(ArrayList<Double> inputList)
   {
      for(int i=0;i< inputList.size();i++)//for hvert tal i inputList
      {
         for(int a=999;a>800;a--)//prøv at dividere med alle tal imellem 999 og 800 
         {
            double factor = inputList.get(i)/a;
            if(factor%1 == 0&&factor <1000)//hvis resultatet er et lige tal og er mindre end 1000
            {
               System.out.println(a+" * "+factor+" = "+inputList.get(i));
            } 
         } 
      } 
   }
   
}  

