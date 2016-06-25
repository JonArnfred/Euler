import java.util.Map;

/*

If the numbers 1 to 5 are written out in words:
one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters
used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive
were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens.
For example, 342 (three hundred and forty-two) contains 23 letters
and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.

 * 
 */

public class NumberLetterCounts {
		
   static String[] singles = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] toTwenty = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
   
   public static void main(String []args){
      int sum = 0;
      // tælle alle bogstaver i 1-9
      for(String s: singles){
         sum += s.length();
         System.out.println(s);
      }
      // tælle alle bogstaver i 10-19
      for(String s: toTwenty){
         sum += s.length();
         System.out.println(s);
      }
      
      // tælle alle bogstaver i 20-99
      for(String ten: tens){
         sum += ten.length();
         System.out.println(ten);
         for(String single: singles){
            String s = ten+single;
            sum += s.length();
            System.out.println(s);
         } 
      }
      
      // tælle alle bogstaver i 100 - 1000
         for(String singleOne: singles){ // tæller 100 - 110, 200 - 210 osv
            String hundred = singleOne + "hundred";
            sum += hundred.length();
            System.out.println(hundred);
            for(String singleTwo: singles){
               String s = new String(singleOne + "hundredand" + singleTwo);
               sum += s.length();
               System.out.println(s);
            }
            for(String toT: toTwenty){ // tæller 110 - 120, 210 - 220 osv
               String s = new String(singleOne + "hundredand" + toT);
               sum += s.length();
               System.out.println(s);
            }
            
            for(String ten: tens){ // tæller 
               String pureTen = new String(singleOne + "hundredand" + ten);
               sum += pureTen.length();
               System.out.println(pureTen);
               for(String singleTwo: singles){
                  String s = new String(singleOne + "hundredand" + ten + singleTwo);
                  sum += s.length();
                  System.out.println(s);
               }
            } 
      }
     sum+="onethousand".length();
    System.out.println(sum);
    
     
	}
}
