package codingProject;

import java.util.Scanner;

public class Q4Palindrome {
    //Check if a String is Palindrome
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input string:");
        String str = scan.nextLine();
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr.replaceAll(" ", "") + str.charAt(i);
        }
        if (reversedStr.equalsIgnoreCase(str.replaceAll(" ", ""))) {
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " is not a palindrome");
        }


    }
}
