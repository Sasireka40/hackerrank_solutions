import java.util.*;
import java.io.*;
import java.lang.Math;

public class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int m=0;
            for(int j=0;j<n;j++)
            {
                int k=(int)(Math.pow(2,j));
                if(j==0)
                {
                    m=a+(k*b);
                }
                else
                     m=m+(k*b);
                System.out.print(m+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
