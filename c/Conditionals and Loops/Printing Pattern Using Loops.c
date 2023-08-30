#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
      int m=n;
    int y=n+(n-1);
    int x[y][y];
    int a=0,b=y-1,c=0,d=y-1;
    while(a<=b && c<=d)
    {
        for(int i=a;i<=b;i++)
        {
            x[c][i]=m;
        }
        c++;
        for(int i=c;i<=d;i++)
        {
            x[i][a]=m;
        }
        a++;
        for(int i=a;i<=b;i++)
        {
           x[d][i]=m;
        }
        d--;
        for(int i=c;i<=d;i++)
        {
            x[i][b]=m;
        }
        b--;
    m--;
    }
    for(int i=0;i<y;i++)
    {
        for(int j=0;j<y;j++)
        {
            printf("%d ",x[i][j]);
        }
        printf("\n");
    }
    return 0;
}
