package LR8;

public interface Printable
{
    void println();
}

// класс-тестер, где проверяется работа программы
class Tester {
    public static void main(String[] args) {
        // создание экземпляра с1 класса Car и передача ему параметров
        Car c1 = new Car("Mercedes-Benz", "S-klasse", "S500", 7000000, 2015);
        c1.println(); //применение метода println() к c1
        // создание объекта c2
        Car c2 = new Car("BMW", "7 Series", "750 Li", 7050000, 2016);
        c2.println(); //применение метода println() к c2
        // создание объекта c3
        Car c3 = new Car("Audi", "A8", "Long", 7450000, 2016);
        c3.println(); //применение метода println() к c3
    }
}

