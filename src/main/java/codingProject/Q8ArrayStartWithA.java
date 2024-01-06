package codingProject;

import java.util.ArrayList;
/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character
 */

public class Q8ArrayStartWithA {

    public static ArrayList<String> filterAndConvertToLower(ArrayList<String> inputList) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A")) {
                result.add(str.toLowerCase());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Orange");
        inputList.add("Avocado");

        ArrayList<String> filteredList = filterAndConvertToLower(inputList);

        System.out.println("Filtered and Lowercased List: " + filteredList);
    }
}
