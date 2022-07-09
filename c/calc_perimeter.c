#include <stdio.h>
#include <math.h>

int main() {
    double radius, perimeter, pi;
    printf("Enter radius: ");
    scanf("%lf", &radius);
    pi = acos(-1.0);
    perimeter = 2 * pi * radius;
    printf("Perimeter of your circle is %lf\n", perimeter);
}