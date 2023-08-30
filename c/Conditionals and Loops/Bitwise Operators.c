#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int a,b,c;
  int max=0,max1=0,max2=0;
  for(int i=1;i<=n;i++)
  {
      for(int j=i+1;j<=n;j++)
      {
           a=i & j;
          if(a>max && a<k)
          {
              max=a;
          }
        
        b=i | j;
          if(b>max1 && b<k)
          {
              max1=b;
          }
          
        c=i ^ j;
          if(c>max2 && c<k)
          {
              max2=c;
          }
          
        
      }
  }
  printf("%d\n",max);
  printf("%d\n",max1);
  printf("%d",max2);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
