package lesson13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.go();

        Man man = new Man(); // либо Man, Human, object (только с методами которые есть в object)
        man.go();
    }
}
