/*******************************************************************
 5. Сформируйте массив из 10 элементов, заполнив его целыми случайными
 числами от –10 до 10. Определите среднее арифметическое элементов
 массива. Сформируйте новый массив, переписав в него элементы
 исходного массива, меньшие среднего. Выполните сортировку исходного
 массива по возрастанию элементов.
********************************************************************/

package exercise5.nikomu;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        // Начальный массив
        int[] array1 = new int[10];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * (20 + 1)) - 10;
        }

        float arithmeticMean = ArithmeticMean(array1);

        // Новый массив
        int[] array2 = new int[NewArraySize(array1, arithmeticMean)];

        for(int i = 0, count = 0; i < array1.length; i++) {
            if(array1[i] < arithmeticMean)
                array2[count++] = array1[i];
        }

        System.out.println("Начальный массив = " + Arrays.toString(array1));
        System.out.println("Среднее арифметическое: " + arithmeticMean);
        System.out.println("Новый массив (до сортировки) = " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Новый массив (после сортировки) = " + Arrays.toString(array2));
    }

    // Метод для нахождения среднего арифметического
    public static float ArithmeticMean(int[] arr) {
        int result = 0;

        for(int item : arr) {
            result += item;
        }

        return result / (float)arr.length;
    }

    // Метод для нахождения размера нового массива
    public static int NewArraySize(int[] arr, float arithmeticMean) {
        int count = 0;

        for(int item : arr) {
            if(item < arithmeticMean)
                count++;
        }

        return count;
    }
}
