// I'm close to you. Look around you carefully.

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int count;
            
    scanf("%d\n", &count);
    
    for (; count > 0; count--) {
        unsigned int num;
        scanf("%u\n", &num);
        printf("%u\n", ~num);
    }
    
    return 0;
}
