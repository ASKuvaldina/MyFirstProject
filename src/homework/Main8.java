package homework;

public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j || i == 4 - j) {
                    System.out.print(mas[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int[][] mas1 = new int[4][4];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == 4 - j) {
                    System.out.print(mas[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
