Problem : You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).
  
Solution : 

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        String str1=str.toString();
        if(s.equals(str1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
