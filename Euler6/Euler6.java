/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/


//Interessant: Math.pov(a,b) returnerer altid en double.
//Den hurtigste! måde at konvertere fra double til long er ved at caste double til long med (long)
public class Euler6
{
     static int a = 2; 
     static int b = 0;
     static int c = 0;

   public static void main(String []args)
   {
      for(int i = 0; i<=14;i++)
      {
         double d = Math.pow(i,a);
         b +=i;
      }
      for (int i = 0; i<=14;i++)
      {
         c +=i;
      }
      System.out.println((long)(Math.pow(c,a)-b));
   }
}