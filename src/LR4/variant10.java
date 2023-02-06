package LR4;

import java.util.Scanner;

public class variant10
{
    public static double SredA(double a, double b)
    {
        return (a+b)/2;
    }
    public static double SredG(double a, double b)
    {
        return Math.sqrt(a*b);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scanner.nextInt();
        System.out.println("Введите b: ");
        double b = scanner.nextInt();
        System.out.println(SredA(a,b));
        System.out.println(SredG(a,b));
    }
}
