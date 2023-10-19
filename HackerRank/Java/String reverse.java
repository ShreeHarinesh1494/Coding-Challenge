Problem : Palindrome or Not

Solution : 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        String str1=str.toString();
        if(s.equals(str1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        
    }
}



