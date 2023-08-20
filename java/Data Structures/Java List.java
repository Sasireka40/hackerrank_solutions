import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> list=new LinkedList<Integer>();
    for(int i=0;i<n;i++){  
        list.add(sc.nextInt()); 
    }   
    int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       sc.nextLine();
       String str=sc.next();
       if(str.equals("Insert"))
       {
           int x=sc.nextInt();
           int y=sc.nextInt();
           list.add(x,y);
       }
       else if(str.equals("Delete"))
       {
           int x=sc.nextInt();
           list.remove(x);
       }
   }
   for(Integer i:list)
   {
       System.out.print(i+" ");
   }
}
}
