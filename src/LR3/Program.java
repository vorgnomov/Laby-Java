package LR3;

import java.io.*;

public class Program {
    private static FileInputStream fileIn;
    private static FileOutputStream fileOut;
    public static void main(String[] args) throws IOException {
        fileIn = new FileInputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR3\\train.txt");
        fileOut = new FileOutputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR3\\train.txt");
        Train train1 = new Train();
        train1.number=train1.getNumber();
        train1.name=train1.getName();
        train1.time=train1.getTime();
        Train train2 = new Train();
        train2.number=train2.getNumber();
        train2.name=train2.getName();
        train2.time=train2.getTime();
        Train train3 = new Train();
        train3.number=train3.getNumber();
        train3.name=train3.getName();
        train3.time=train3.getTime();

        fileOut.write(train1.sendMessage());
        fileOut.write(train2.sendMessage());
        fileOut.write(train3.sendMessage());

        System.out.println(fileIn.read());
        /*train1.sendMessage();
        train2.sendMessage();
        train3.sendMessage();*/
    }
}
