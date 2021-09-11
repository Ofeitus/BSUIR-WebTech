package by.bsuir.webtech.lab1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("h: ");
        double h = input.nextDouble();
        for (double x = a; x < b; x += h) {
            System.out.printf("x: %8.5f  tg(x): %8.5f\n", x, Math.tan(x));
        }
        System.out.printf("x: %8.5f  tg(x): %8.5f", b, Math.tan(b));
    }
}
