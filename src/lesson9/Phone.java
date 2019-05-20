package lesson9;

public class Phone {
    private double diagonal;
    private String model;
    private int price;
    public void setPrice(int newPrice){
        price = newPrice;
    }

    public int getPrice(){ // узнаем цену с помощью этого метода
        return price;
    }

    public void setDiagonal(double newDiagonal){
        diagonal = newDiagonal;
    }

    public double getDiagonal(){
        return diagonal;
    }

    public void setModel(String newModel){
        model = newModel;
    }

    public String getModel(){
        return model;
    }
    // поля класса - переменные внутри класса, которые описывают состояние объекта
    // Инкапсуляция - мы должны скрывать данные классов для безопасности. Реализуется с помощью модификатора доступа
    // модификатор доступа - слово, которое ограничивает область видимости. его нужно поставить перед классом, перед переменной, методом, конструктором
}
