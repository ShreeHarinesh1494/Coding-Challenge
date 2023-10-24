Problem : Anagrams or Not Anagrams

Solution :

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String st1=str1.toLowerCase();
        String st2=str2.toLowerCase();
        if(st1.length()==st2.length())
        {
            char[] s1=st1.toCharArray();
            char[] s2=st2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            boolean result = Arrays.equals(s1,s2);
            if(result)
            {
                System.out.println("Anagrams");
            }
            else
            {
                System.out.println("Not Anagrams");
            }
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}
