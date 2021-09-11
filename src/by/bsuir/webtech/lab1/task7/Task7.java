package by.bsuir.webtech.lab1.task7;

public class Task7 {
    public static void sort(double[] array)
    {
        for (int i = 0; i < array.length - 1; )
        {
            if (array[i] > array[i + 1])
            {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0)
                    i--;
            } else if (i != array.length - 1)
                i++;
        }
    }

    public static void main(String[] args)
    {
        double[] array = {4.23, 17.2, -0.54, 0.54, 0.54, 2.34, 1.2, 8, 7.43};

        sort(array);

        for (double num : array)
            System.out.print(num + "  ");
    }
}
