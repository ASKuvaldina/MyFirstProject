package homework;

public class Math6 {
    public static int areaTriangle(int sideA, int sideB, int sideC) {
        double poluPerimetr = (sideA + sideB + sideC) / 2;
        int areaTriangles = (int) (Math.sqrt(poluPerimetr * (poluPerimetr - sideA) * (poluPerimetr - sideB) * (poluPerimetr - sideC)));
        return areaTriangles;
    }

    public static void printChetArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void sumDrobi(double firstNumerator, double firstDenominator, double secondNumerator, double secondtDenominator) {
        double summaDrobi = (firstNumerator / firstDenominator) + (secondNumerator / secondtDenominator);
        System.out.println("Сумма дробей равна = " + summaDrobi);
    }
}
