package LR2;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie1
{
    public static void main(String[] args) {
        int[] num = new int[10];
        int sum = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите значения массива: ");
            num[i] = scanner.nextInt();
        }
        var min = Arrays.stream(Arrays.stream(num).map(Math::abs).toArray()).min().getAsInt();
        for (int i = 0; i < 10; i++) {
            if (num[i] == min) {
                m = i;
            }
        }
        for (int i = m + 1; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("min: " + min);
        System.out.println("sum: " + sum);
    }
}
