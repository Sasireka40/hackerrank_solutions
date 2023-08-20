import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
        BigInteger n = sc.nextBigInteger();
        sc.close();
      System.out.println( n.isProbablePrime(1000) ? "prime" : "not prime" );
    }
}
