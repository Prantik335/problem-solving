// Book: Programming Contest Data Structure & Algorithm
// Chapter 2.3

#include <stdio.h>

int main() {
    int num1, num2, num3, container;

    scanf("%d %d %d", &num1, &num2, &num3);

    if(num1 > num2 && num1 > num3) {
    } else if(num2 > num3) {
        container = num1;
        num1 = num2;
        num2 = container;
    } else {
        container = num1;
        num1 = num3;
        num3 = container;
    }

    if(num3 > num2) {
        container = num2;
        num2 = num3;
        num3 = container;
    }

    printf("%d, %d, %d\n", num3, num2, num1);
}