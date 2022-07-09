// Book: Programming Contest Data Structure & Algorithm
// Chapter 2.2

#include <stdio.h>
#include <math.h>

int main() {
    int number, nearest_int;
    double root;
    printf("Enter a number: ");
    scanf("%d", &number);
    root = sqrt(number);
    nearest_int = round(root);
    printf("Nearest integer of root(%d) is %d\n", number, nearest_int);
}