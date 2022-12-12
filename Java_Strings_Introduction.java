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
        int i = A.compareTo(B);
        if(i <= 0)
            System.out.println("NO");
        else
            System.out.println("Yes");
        /*   capitalize the first letter in both A and B and print them on a single line, separated by a space. */ 
        int delta = 'a'-'A' ; // +32
		char ch = A.charAt(0); // ch = 'a'
		char ah = B.charAt(0); // ch = 'a'
		// 'a' -> 'A'
		char val = (char) (ch-delta); // val = char(a-32) = 'A'
		char valu = (char) (ah-delta); // val = char(a-32) = 'A'
		String ans = val + A.substring(1);
		String answ = valu + B.substring(1);
		System.out.print(ans+" ");
		System.out.print(answ);
    }
}

