package lesson8;

public class Main {
    public static void main(String[] args) {
        int[] massive1 = {40, 78, 6, 55, 15, 34, 789, 856, 999, 345};
        int sumChiselby5 = Methods.summaChiselBy5(massive1);
        int[] result = Methods.massivWithNums(massive1, '5');
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        String text1 = "Hello I am from Russia";
        String text2 = "Hi May I";
        String equal = Methods.getEqualChar(text1,text2);
        System.out.println(equal);
    }
}
