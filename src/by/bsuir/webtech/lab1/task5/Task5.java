package by.bsuir.webtech.lab1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Array[%d] = ", i);
            A[i] = input.nextInt();
        }

        int[] d = new int[N];

        for (int i = 0; i < N; ++i) {
            d[i] = 1;
            for (int j = 0; j < i; ++j)
                if (A[j] < A[i])
                    d[i] = Math.max(d[i], 1 + d[j]);
        }

        int max = d[0];
        for (int i = 0; i < N; ++i)
            max = Math.max(max, d[i]);

        System.out.println("\nK = " + (N - max));
    }
}
