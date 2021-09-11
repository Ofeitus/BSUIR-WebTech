package by.bsuir.webtech.lab1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("y: ");
        int y = input.nextInt();
        System.out.print(0 <= y && y <= 5 && -4 <= x && x <= 4 || -3 <= y && y <= 0 && -6 <= x && x <= 6);
    }
}
