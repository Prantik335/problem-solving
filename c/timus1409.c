#include <stdio.h>

int main() {
    int h, l, c;
    scanf("%d %d", &h, &l);
    c = h + l - 1;
    printf("%d %d\n", c - h, c - l);
}