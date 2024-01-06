package codingProject;

import java.util.Arrays;

public class Q7WordsInString {
    /*
    Write a function to count the number of words in a given string.
    Words are separated by spaces or punctuation. For example, the
    input "Hello, world!" should return 2
     */

    public static int countWords(String input) {
        String[] words = input.split("\\s+|\\p{Punct}");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "Hello, World";
        System.out.println(countWords(str));
        //or you can write
        int wordCount = countWords(str);
        System.out.println("The number of words is: " + wordCount);
    }

}
