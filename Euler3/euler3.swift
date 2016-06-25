/*
 euler 3
 The prime factors of 13195 are 5, 7, 13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 */
var number:Int64 = 600851475143

var i:Int64 = 1

while i * i < number{
    if number % i == 0{
        number = number / i
    }
    i = i+2
}

print(number)