package LR2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class zadanie1
{
    private static FileInputStream fileIn;
    private static FileOutputStream fileOut;

    public static void main(String[] args) throws IOException {
        fileIn = new FileInputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR2\\myfile.txt");
        fileOut = new FileOutputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR2\\myfile.txt");
        int[] num = new int[10];
        int sum = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите значения массива: ");
            num[i] = scanner.nextInt();
        }
        var min = Arrays.stream(Arrays.stream(num).map(Math::abs).toArray()).min().getAsInt();
        fileOut.write(min);
        for (int i = 0; i < 10; i++) {
            if (num[i] == min) {
                m = i;
            }
        }
        for (int i = m + 1; i < num.length; i++) {
            sum += num[i];
        }
        fileOut.write(sum);
        System.out.println("min "+fileIn.read()+"; sum "+fileIn.read());
        //System.out.println("min: " + min);
        //System.out.println("sum: " + sum);
    }
}
