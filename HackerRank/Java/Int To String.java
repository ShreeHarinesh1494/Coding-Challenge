Problem : Convert and check whether int is converted to String

Solution :

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        if(s!=null)
        {
            System.out.print("Good job");
        }
        else
        {
            System.out.print("Wrong job");
        }
    }
}
