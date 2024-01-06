package codingProject;

import java.util.Arrays;
/*
Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order
 */

public class Q5CheckIfAnagram {

    public static void main(String[] args) {

        String str1 = "a gentleman";
        String str2 = "elegant man";

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] strCharArray1 = str1.toCharArray();
        char[] strCharArray2 = str2.toCharArray();

        Arrays.sort(strCharArray1);
        Arrays.sort(strCharArray2);

        boolean areAnagrams = Arrays.equals(strCharArray1, strCharArray2);

        if (areAnagrams){
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }

    }
}
