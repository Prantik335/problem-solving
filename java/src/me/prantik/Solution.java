package me.prantik;

import java.util.Scanner;

public class Solution {

    static int frequency(char c, String str) {
        int count = 0;

        for (char _c : str.toCharArray()) {
            if (Character.toString(c).equalsIgnoreCase(Character.toString(_c))) count++;
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int pos = 0;
        while (frequency(a.charAt(pos), a) == frequency(a.charAt(pos), b) && ++pos < a.length()) ;

        return pos == a.length();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
