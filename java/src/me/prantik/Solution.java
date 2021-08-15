package me.prantik;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        LinkedList<String> substrings = new LinkedList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }
        substrings.sort(Comparator.naturalOrder());

        return substrings.getFirst() + "\n" + substrings.getLast();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}