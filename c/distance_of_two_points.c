// Book: Programming Contest Data Structure & Algorithm
// Chapter 2.2

#include <stdio.h>
#include <math.h>

int main() {
    int x1, y1, x2, y2;
    double distance;

    printf("x1: ");
    scanf("%d", &x1);
    printf("y1: ");
    scanf("%d", &y1);
    printf("x2: ");
    scanf("%d", &x2);
    printf("y2: ");
    scanf("%d", &y2);

    distance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    printf("Distance between Point(%d, %d) & Point(%d, %d) is %lf\n", 
    x1, y1, x2, y2, distance);
}