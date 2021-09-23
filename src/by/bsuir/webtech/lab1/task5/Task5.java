package by.bsuir.webtech.lab1.task5;

public class Task5 {
    public static void main(String[] args) {
        int[] A = new int[]{6, 5, 4, 3, 4, 5, 2, 1};

        int[] d = new int[A.length];

        for (int i = 0; i < A.length; ++i) {
            d[i] = 1;
            for (int j = 0; j < i; ++j)
                if (A[j] < A[i])
                    d[i] = Math.max(d[i], 1 + d[j]);
        }

        int max = d[0];
        for (int i = 0; i < A.length; ++i)
            max = Math.max(max, d[i]);

        System.out.println("\nK = " + (A.length - max));
    }
}
