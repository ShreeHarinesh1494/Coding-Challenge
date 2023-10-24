Problem : Factory Pattern using String Methods

Solution :
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.equals("cake"))
        {
            System.out.println("The factory returned class Cake");
            System.out.println("Someone ordered a Dessert!");
        }
        else
        {
            System.out.println("The factory returned class Pizza");
            System.out.println("Someone ordered a Fast Food!");
        }
    }
}
