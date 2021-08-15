package me.prantik;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }

    public static boolean isPalindrome(String word) {
        int s = 0, e = word.length();
        while (word.charAt(s++) == word.charAt(--e) && s <= e);
        return s > e;
    }
}

