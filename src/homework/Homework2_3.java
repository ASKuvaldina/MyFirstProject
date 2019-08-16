package homework;

public class Homework2_3 {
    public static void main(String[] args) {
        for (int x = 50; x < 1001; x++) {
            if (x % 7 == 0) {
                System.out.println(x + " - это число делится на 7");
            }
            if (x % 19 == 0) {
                System.out.println(x + " - это число делится на 19");
            }
            /*if (x % 7 == 0 || x % 19 == 0) {
                System.out.println(x + " - это число делится на 7 или на 19");
            }*/

        }

    }
}
