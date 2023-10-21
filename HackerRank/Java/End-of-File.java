Problem : End-of-File

Solution :

import java.util.*;
public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do 
        {
           
            String str1 = sc.nextLine();
            System.out.println(i + " " + str1);
            i++;
        } while(sc.hasNext());
        sc.close();
    }
}
    
