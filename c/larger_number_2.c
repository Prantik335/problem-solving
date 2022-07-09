// Book: Programming Contest Data Structure & Algorithm
// Chapter 2.3

#include <stdio.h>

int main() {
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    if(num1 > num2) {
        printf("%d is larger.\n", num1);
    } else if(num1 == num2) {
        printf("Numbers are equal.\n");
    } else {
        printf("%d is larger.\n", num2);
    }
    return 0;
}