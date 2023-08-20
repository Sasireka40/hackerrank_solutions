import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n=A.length();
        int m=B.length();
        int y=n+m;
        System.out.println(y);
        if(A.charAt(0)>B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
