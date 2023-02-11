package LR5;

import java.util.Scanner;

public class zadanie1
{
    public static double Y(double a, double b, double h, double n)
    {
        double res=0;
        for (double x=a; x<=b; x+=h)
        {
            res=((1+Math.pow(x,2))/2)*Math.atan(x)-(x/2);
            System.out.printf("Y(x)=%.4f ",res);
        }
        return res;
    }
    public static int Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static double S(double a, double b, double h, double n)
    {
        double res=0;
        for (double x=a; x<=b; x+=h)
        {
            for(int k=1; k<n; k++)
            {
                res = Math.pow(-1, k + 1) * (Math.pow(x, 2 * k + 1)) / (4 * Factorial(k) - 1);
                System.out.printf("S(x)=%.4f ",res);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите h: ");
        double h = scanner.nextDouble();
        System.out.println("Введите n: ");
        double n = scanner.nextDouble();
        //Y(a,b,h,n);
        //S(a,b,h,n);
        for (double x=a; x<=b; x+=h) {
            System.out.printf("x = %.4f  ",x);
        }
        System.out.printf("\n");
        System.out.printf(String.valueOf(S(a,b,h,n))+" \n");
        System.out.printf(String.valueOf(Y(a,b,h,n)));
    }
}
