package LR4;

import java.util.Scanner;
public class Variant9_Arina
{
    public static double Y(double a, double b, double c)
    {
        double min_ab=Math.min(a,b);
        double min_bc=Math.min(b,c);
        double max_ab=Math.max(a,b);
        double max_bc=Math.max(b,c);
        double y=Math.min(min_ab,min_bc)/Math.max(max_ab,max_bc);
        return y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите c: ");
        int c = scanner.nextInt();
        System.out.println("y= "+Y(a, b, c));
    }
}
