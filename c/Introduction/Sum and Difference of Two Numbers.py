#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int n,m;
    float n1,m1;
    scanf("%d %d",&n,&m);
    scanf("%f %f",&n1,&m1);
    printf("%d %d",n+m,n-m);
    printf("\n%.1f %.1f",n1+m1,n1-m1);
	
    
    return 0;
}
