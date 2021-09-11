package by.bsuir.webtech.lab1.task6;

public class Task6 {
    public static void printMatrix(int[][] matrix, int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N = 101;
        int[] numbers = new int[N];
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.arraycopy(numbers, i, matrix[i], 0, N - i);
            System.arraycopy(numbers, 0, matrix[i], N - i, i);
        }

        printMatrix(matrix, N, N);
    }
}
