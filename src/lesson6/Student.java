package lesson6;

public class Student {
    // формула создания метода
    // 1 - модификатор доступа (public,private, protected, пустое место)
    // public - доступ по всему проекту
    // пустое место - доступ внутри текущей папки
    // protected - доступ только внутри текущего класса, и его наследники
    // private - доступ внутри текущего класса
    // 2 - статичность static есть(кто угодно может вызвать) или нет
    // 3 - возвращаемый тип(int,String, char[] ...) или если нет возвращаемого типа void
    // 4 - название метода (с мал буквы)
    // 5 - входящие параметры в круглых скобках через запятую (тип и название переменной)
    // 6 - {] - тело метода, то что будет выполняться при вызове

    public static int summaThreeChisla(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static int perimetrPryuamoug(int a, int b) {
        int perimetrp = (a + b) * 2;
        return perimetrp;
    }

    public static void printHello(int skolkoRasVivesti) { //если void то не пишем return, мы не ждем результата
        for (int i = 0; i < skolkoRasVivesti; i++) {
            System.out.println("Привет");
        }
    }

    public static void chetNeChet(int chislo) { //если void то не пишем return, мы не ждем результата
        if (chislo % 2 == 0) {
            System.out.println(chislo +" Это число четное");
        } else System.out.println(chislo +" Это число нечетное");
    }

}
