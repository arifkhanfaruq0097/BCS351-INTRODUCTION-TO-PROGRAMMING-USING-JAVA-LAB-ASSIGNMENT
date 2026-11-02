// Name: Arif Khan
// Roll No: 2510303124
// Assignment 13 - Question 2

public class Main {
    public static void main(String[] args) {

        String word = "Java";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("Reversed: " + reverse);
    }
}
