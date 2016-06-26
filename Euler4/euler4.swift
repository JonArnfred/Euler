/*
  euler 4
 
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 
 Find the largest palindrome made from the product of two 3-digit numbers.
 */
import Foundation

var result:Int = 0;
var solution = result;


for i in 0...1000{
    for j in 0...1000{
        result = i*j;
        if(String(result) == String(String(result).characters.reverse())){
            if(result>solution){
                solution = result
            }
        }
    }
}
print(solution)
