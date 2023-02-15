package LR6;

import java.util.Objects;
import java.util.Scanner;

class Person {
    private String _fio;
    private int[] _birthday = new int[3];
    private String _address;

    public Person() {
    }

    public Person(String fio, int[] birthday, String address) {
        this._fio = fio;
        this._birthday = birthday;
        this._address = address;
    }

    public String get_address() {
        System.out.println("Address: " + this._address);
        return this._address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public int[] get_birthday() {
        System.out.println("Birthday: " + this._birthday[0] + ":" + this._birthday[1] + ":" + this._birthday[2]);
        return this._birthday;
    }

    public void set_birthday(int[] _birthday) {
        this._birthday = _birthday;
    }

    public String get_fio() {
        System.out.println("FIO: " + this._fio);
        return _fio;
    }

    public void set_fio(String _fio) {
        this._fio = _fio;
    }
}

class Client extends Person {
    public Client() {
    }

    public Client(String fio, int[] birthday, String address, int hotelStops) {
        super(fio, birthday, address);

        this._hotelStops = hotelStops;
    }

    private int _hotelStops;

    public void InputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        this.set_fio(scanner.next());

        System.out.println("Введите день рождения:");
        int year, month, day;
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();

        this.set_birthday(new int[]{year, month, day});

        System.out.println("Введите адрес:");
        this.set_address(scanner.next());
    }

    public void ShowData() {
        this.get_fio();
        this.get_birthday();
        this.get_address();
    }
}
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Person();
        people[0].set_address("Калатушкино дом 2");
        people[0].set_fio("Гномов Гном Гномыч");
        people[0].set_birthday(new int[]{23, 8, 2005});

        people[1] = new Person();
        people[1].set_address("Гемалаи дом 8");
        people[1].set_birthday(new int[]{15, 4, 2005});
        people[1].set_fio("Внун Генадий Борисович");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста фио человека");
        String fio = scanner.nextLine();
        for (int i = 0; i < 2; i++) {
            if (Objects.equals(people[i].get_fio(), fio)) {
                System.out.println(people[i].get_address());
            }
        }

        Client client = new Client();

        client.InputData();
        client.ShowData();
    }
}
