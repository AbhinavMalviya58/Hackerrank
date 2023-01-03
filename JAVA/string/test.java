public class test {
    public static void main(String[] args) {
        String str = "MALAYALAM";
        boolean ans = isPalindrome(str);
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
