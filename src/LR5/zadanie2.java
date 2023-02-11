package LR5;

import java.util.Scanner;

public class zadanie2 {
    public static double Fibonachi(int n)
    {
        double f0 = 0;
        double f1 = 1;
        double result = n;
        for (int i = 1; i < n; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }
    public static double RecursiveFibonachi(int n)
    {
        if (n <= 1) {
            return n;
        }
        return RecursiveFibonachi(n - 2) + RecursiveFibonachi(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите n: ");
        int n= scanner.nextInt();
        System.out.println("Рекурсия " + RecursiveFibonachi(n));
        System.out.println("Обычная функция " + Fibonachi(n));
        if (RecursiveFibonachi(n)==Fibonachi(n)) System.out.println("Значения обычной и рекурсивной функции равны");
        else System.out.println("Значения обычной и рекурсивной функции не равны");
    }

}
