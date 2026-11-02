// Name: Arif Khan
// Roll No: 2510303124
// Assignment 14 - Question 2

public class Main {
    public static void main(String[] args) {

        String word = "programming";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
