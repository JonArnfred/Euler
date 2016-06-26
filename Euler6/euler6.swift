/*
 euler 6
 */
import Foundation
var sum = 0
var squared = 0

for i in 0...100{
    sum = sum + i
    squared = (i * i) + squared
}

print((sum * sum)-squared)