package codingProject;

public class Q3ReverseString {
//Write a function to reverse a given string
    public static String reverseString(String word){
        String reverseWord = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;
    }

    public static void main(String[] args) {


        System.out.println(reverseString("Hello world"));
    }
}
