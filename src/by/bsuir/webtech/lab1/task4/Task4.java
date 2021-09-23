package by.bsuir.webtech.lab1.task4;

import java.util.Arrays;

public class Task4 {
    public static boolean isPrime(int n) {
        if (n > 1) {
            boolean[] numbers = new boolean[n + 1];
            Arrays.fill(numbers, true);
            numbers[1] = false;
            for (int i = 2; i * i < n + 1; i++)
                if (numbers[i])
                    for (int j = i * i; j < n + 1; j += i)
                        numbers[j] = false;
            return numbers[n];
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{0, 2, 5, 24, 17, 101};
        System.out.print("Indices of primes: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i]))
                System.out.print(i + " ");
        }
    }
}
