package homework;

public class Homework2_2 {
    public static void main(String[] args) {
        for (int x = 500; x < 1001; x++) {
            if (x % 7 == 0) {
                System.out.println(x + " - это число делится на 7");
            }
            if (x % 19 == 0) {
                System.out.println(x + " - это число делится на 19");
            }
        }
    }
}
