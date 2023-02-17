package LR2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    private static FileInputStream fileIn;
    private static FileOutputStream fileOut;
    public static void main(String[] args) throws IOException {
        fileIn = new FileInputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR2\\myfile2.txt");
        fileOut = new FileOutputStream("D:\\IntelliJ IDEA\\laby java\\Java Laboratories\\src\\LR2\\myfile2.txt");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Введите m: ");
        int m = scanner.nextInt();
        int[][] mas = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int i1 = -10;
                mas[i][j]= (int) ((Math.random())*((10-i1)+1))+i1;
                System.out.print(mas[i][j] + "  ");
                //fileOut.write(mas[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > i) {
                    sum += Math.abs(mas[i][j]);
                }
            }
        }
        fileOut.write(sum);
        System.out.println("Сумма: " + fileIn.read());
    }
}
