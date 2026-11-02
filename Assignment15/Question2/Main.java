// Name: Arif Khan
// Roll No: 2510303124
// Assignment 15 - Question 2

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
            sb.append(",");
        }

        // Remove the last comma
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
