package codingProject;

import java.util.ArrayList;
import java.util.List;

public class Q10removeDupArrList {
    public static void main(String[] args) {
    //remove all duplicates from ArrayList
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Kelly");
        list.add("Ivan");
        list.add("Frank");
        list.add("Kelly");

        System.out.println("Original List: " + list);

        int size = list.size();

        for (int i = 0; i < size; i++) {
            String currentIndex = list.get(i);
            for (int j = i + 1; j < size; j++) {
                if (currentIndex.equals(list.get(j))) {
                    // Remove the duplicate element
                    list.remove(j);
                    size--;
                    j--;//Adjusts loop counter
                }
            }
        }

        System.out.println("Updated list with duplicates removed: " + list);
    }
}
