package LR1;

public class zadanie1 {
    public static void main(String[] args) {
        int r=6;
        int h=12;
        double V=Math.PI*Math.pow(r,2)*h;
        double S=2*Math.PI*r*(r+h);
        System.out.println("Объём: "+V+", площадь"+S);
    }
}