package javaprograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_string = str;

        String rev=" ";

        int len = str.length(); // 4
        for (int i = len - 1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if (org_string.equals(rev)){
            System.out.println(org_string + "palindrome string");
        }
        else
        {
            System.out.println(org_string + "not palindrome");
        }
    }
}
