Problem : Java Strings Introduction.java

Solution :
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        if(A.compareTo(B)<=0)
        {
            System.out.println("No");
        }
        else
        System.out.println("Yes");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" "+B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
        
        
    }
}



