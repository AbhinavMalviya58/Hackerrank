import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* String length. */
        String c = A + B;
        System.out.println(c);
        int size = c.length();
        System.out.println(size);
        /*  For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.  */ 
        int x = A.length();
        int y = B.length();
        if(x < y)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



