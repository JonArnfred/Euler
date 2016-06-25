import Foundation



var result = 0;
for index in 1...1000{
    if(index%5==0||index%3==0){
        result+=index;
    }
}

print(result);

