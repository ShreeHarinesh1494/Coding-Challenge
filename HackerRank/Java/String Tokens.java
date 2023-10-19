Problem : String Tokenizer

Solution :

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        StringTokenizer str=new StringTokenizer(s,"? , ' ! . _ @");
        System.out.println(str.countTokens());
        while(str.hasMoreElements())
        {
            System.out.println(str.nextElement());
        }
    }
}

