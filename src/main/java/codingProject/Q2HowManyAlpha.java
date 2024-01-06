package codingProject;

public class Q2HowManyAlpha {

    public static void main(String[] args) {
//Find out how many alpha characters are present in a string
        String str = "Hello123";
        int howManyAlpha = str.replaceAll("[^a-zA-Z]", "").length();
        System.out.println("Alpha characters count: " + howManyAlpha);
    }
}
