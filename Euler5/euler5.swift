/*
 
 euler 5
 
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 
 */

var foundIt:Bool = false
var i:Int = 20;


while(foundIt == false){
    var a:Int = 20
    i = i+1 // i tæller op
    while(i % a == 0){
        a = a-1
        if(a == 0){
            foundIt = true
            break
        }
    }
}

print(i)