import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len_A = A.length();
        int len_B = B.length();

        
        System.out.print(((A.substring(0,1)).toUpperCase()+(A.substring(1,len_A).toLowerCase()))+" "+ 
                          ((B.toUpperCase())));
    }
}