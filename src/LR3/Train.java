package LR3;

import java.util.Scanner;

public class Train {
    public int number = 0;
    public String name = "";
    public String time = "";
    Scanner scanner = new Scanner(System.in);
    public void receiveTrain()
        {
            System.out.println("Поезд рейса " + name);
        }
        public int getNumber()
        {
            System.out.println("Введите номер поезда: ");
            number = scanner.nextInt();
            return number;
        }
        public String getName()
        {
            System.out.println("Введите пункт назначения поезда: ");
            name = scanner.next();
            return name;
        }
        public String getTime()
        {
            System.out.println("Введите время отправления: ");
            time = scanner.next();
            return time;
        }
        public byte[] sendMessage()
        {
            System.out.println("Номер поезда который сейчас отправляется: "+number);
            return new byte[0];
        }
        public void receiveTrain(String name, String number)
        {

        }

    Train(int number, String name) {

    }
    Train()
    {

    }
}
