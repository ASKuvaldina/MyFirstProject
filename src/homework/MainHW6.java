package homework;

public class MainHW6 {
    public static void main(String[] args) {

        int areaTriangles = Math6.areaTriangle(4, 5, 3);
        System.out.println("Площадь треугольника равна = " + areaTriangles);

        int[] array = {4, 5, 2, 94, 23, 5, 1, 7};
        Math6.printChetArray(array);

        Math6.sumDrobi(3.0, 60.0, 1.0, 7.0);

        String text = "My life is beautiful";
        String textRevers = StringUtils.reverse(text);
        System.out.println("Перевернутый текст: " + textRevers);

        int countGlas = StringUtils.countGlass(text);
        System.out.println("Количество гласных - " + countGlas);

        int countSoglasnie = StringUtils.countSoglasnie(text);
        System.out.println("Количество согласных - " + countSoglasnie);

    }
}
