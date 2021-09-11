package by.bsuir.webtech.lab1.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();
        double z = (1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
        System.out.println("z = " + z);
    }
}
