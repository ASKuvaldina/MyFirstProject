package homework;

public class Homework4_3 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        char[] arr1 = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arr1[i] = array[j];
            System.out.println(array[i]);
        }
    }
}
