package LR8;

//создадим класс Car, использующий интерфейс Printable и его методы
public class Car implements Printable {
    //слово implements означает то, что данный класс реализует какой-либо интерфейс (например, Printable)
    String brand;
    String model;
    String configuration;
    int price;
    int year;

    // идут «геттеры» и «сеттеры» для объявленных переменных
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getConfiguration() {
        return configuration;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    //конструктор
    Car(String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    // реализация метода println() из нашего интерфейса Printable, созданного ранее
    public void println() {
        System.out.println("Автомобиль марки: " + brand + " Модель: " + model + " Конфигурация: " + configuration + " Цена " + price + " Год выпуска:" + year);
    }
}
