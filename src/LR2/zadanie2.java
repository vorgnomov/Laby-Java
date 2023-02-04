package LR2;

import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
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
                mas[i][j] = random.nextInt(-10, 10);
                System.out.print(mas[i][j] + "  ");
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

        System.out.println("Сумма: " + sum);
    }
}
