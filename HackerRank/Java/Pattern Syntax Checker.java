Problem : Pattern Syntax Checker using Regex

Solution :
  
import java.io.*;
import java.util.*;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
public class Solution 
{

    
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            if(isPatternValid(s))
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
    public static boolean isPatternValid(String s)
    {
        try
        {
            Pattern.compile(s);
            return true;
        }
        catch(PatternSyntaxException e)
        {
            return false;
        }
        
    }
}
