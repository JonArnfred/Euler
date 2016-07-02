/*
 
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 
 What is the 10 001st prime number?
 
 */
import Foundation


var nthPrime = 1 // 2 is prime
var number = 1 // 1+2 = 3 is the first unequal number that is potentially a prime

while(nthPrime < 10001){

    // only odd numbers can be primes
    number = number + 2
    // we asume it is a prime
    nthPrime = nthPrime + 1
    
    for divider in 3.stride(to: number, by:2){
        if(number%divider == 0){
            // if it can be divided, its not a prime anyway and we break
            nthPrime = nthPrime - 1
            break
        }
    }

}
print("\(nthPrime)th prime is \(number)")
