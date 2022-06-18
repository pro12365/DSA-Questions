import java.util.Scanner;

public class LongestPalindromicSubstring {
    // a function to expand the String Given it actually a function which checks
    // wether the strings end with same character or not
    public static String expand(String str, int low, int high) {
        while (low >= 0 && high <= str.length() && (str.charAt(low) == str.charAt(high))) {
            high++;
            low--;
        }
        return str.substring(low + 1, high);

    }

    // The function which finds the longest Palindrome String
    public String longestPalindrome(String str) {
        //Checking a Base Condition it checks wether the String is null or the length of the String is null
        if (str == null || str.length() == 0) {
            return str;
        }
        String max_string = "";
        int max_length = 0;
        String curr_string;
        int curr_length;
// going through the String or in terms scanning eah character of String
        for (int i = 0; i < str.length(); i++) {
            //Checking the Palindromic nature of the given String
            curr_string = expand(str, i, i);
            curr_length = curr_string.length();
            //Storing the palindromic substring with maximum length
            if (curr_length > max_length) {
                max_length = curr_length;
                max_string = curr_string;
            }
            curr_string = expand(str, i, i + 1);
            curr_length = curr_string.length();
            if (curr_length > max_length) {
                max_length = curr_length;
                max_string = curr_string;
            }
        }

        return max_string;
    }

    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        LongestPalindromicSubstring lp = new LongestPalindromicSubstring();
        String n_str = lp.longestPalindrome(str);
        System.out.println("The maximum Palindrome result=" + n_str);
    }

}
