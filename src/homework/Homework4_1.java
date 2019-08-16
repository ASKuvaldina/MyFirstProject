package homework;

public class Homework4_1 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";

        String[] words = text.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
