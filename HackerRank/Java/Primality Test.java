Problem : To check whether the no is prime/not

Solution:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        BigInteger b=new BigInteger(sc.nextLine());
        if(b.isProbablePrime(1))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
