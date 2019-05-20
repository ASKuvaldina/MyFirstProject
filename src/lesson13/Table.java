package lesson13;

public class Table {

    private int height;
    private int lenght;
    private int widht;

    public Table() {
    }

    public Table(int height, int lenght, int widht) {
        this.height = height;
        this.lenght = lenght;
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false; // - о является объектом типа тэйбл?

        Table table = (Table) o; // о стал обектом тэйбл
// сравнение полей класса
        if (getHeight() != table.getHeight()) return false; // this.getHeight() - у тэбл1
        if (getLenght() != table.getLenght()) return false;
        return getWidht() == table.getWidht();
    }

    @Override
    public int hashCode() { // уникалььное число
        int result = getHeight();
        result = 31 * result + getLenght();
        result = 31 * result + getWidht();
        return result;
    }

    @Override
    public String toString() {
        return "Table {" +
                "height =" + height +
                ", lenght =" + lenght +
                ", widht =" + widht +
                '}';
    }
}
