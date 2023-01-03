import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean ans = isPalindrome(A);
        if (ans == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    
    }
    static boolean isPalindrome(String str) { // str = "computer"
        int n = str.length();
        int start = 0, end = n - 1;
        char[] arr = str.toCharArray(); // arr = "computer"

        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
