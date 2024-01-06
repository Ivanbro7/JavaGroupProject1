package codingProject;

public class Q6HowManyVowels {
//Create a method to count how many vowels are present in a string
    public static int countVowels(String word){
        int count = 0;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "documentation";
        int result = countVowels(str);

        System.out.println("The number of vowels in the word " + str + " is: " + result);



    }
}
