/************************************************************
 6. Сформируйте двумерный целочисленный массив. Число строк и
 столбцов нужно запросить у пользователя. Заполните массив
 случайными числами от 0 до 10 и выведите его на консоль.
 Удалите из массива одну строку (номер строки запросите у
 пользователя). Распечатайте полученный массив. Используйте
 статические методы для реализации каждого действия
 (инициализация массива, вывод на консоль, удаление строки).
 ************************************************************/

package exercise6.nikomu;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");

        while (!input.hasNextInt()) {
            System.out.println("Ошибка ввода!!! Укажите целое число.\n");
            System.out.print("Введите количество строк массива: ");
            input.nextLine();
        }

        // Переменная для хранения количества строк
        int rowCount = input.nextInt();

        System.out.print("Введите количество столбцов массива: ");

        while (!input.hasNextInt()) {
            System.out.println("Ошибка ввода!!! Укажите целое число.\n");
            System.out.print("Введите количество столбцов массива: ");
            input.nextLine();
        }

        // Переменная для хранения количества столбцов
        int columnCount = input.nextInt();

        // Начальный массив
        int[][] array1 = (CreateArray(rowCount, columnCount));

        System.out.println("Массив до удаления строки: \n");
        ShowArray(array1);
        System.out.println();

        System.out.print("Введите номер строки массива, которую необходимо удалить: ");

        while (!input.hasNextInt()) {
            System.out.println("Ошибка ввода!!! Укажите целое число.\n");
            System.out.print("Введите номер строки массива, которую необходимо удалить: ");
            input.nextLine();
        }

        // Переменная для хранения строки, которую будем удалять
        int deleteRow = input.nextInt();

        // Массив после удаления строки
        int[][] array2 = DeleteRow(array1, deleteRow - 1);

        System.out.println("Массив после удаления строки: \n");
        ShowArray(array2);
        System.out.println();
    }

    // Метод для создания массива
    static int[][] CreateArray(int rows, int columns) {
        // Временный массив
        int[][] tempArr = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                tempArr[i][j] = (int)(Math.random() * 10);
            }
        }

        return tempArr;
    }

    // Метод для отображения массива
    static void ShowArray(int[][] arr) {
        for(int[] rowItem : arr) {
            System.out.println(Arrays.toString(rowItem));
        }
    }

    // Метод для удаления строки (создание нового массива, исключающего указанную строку)
    static int[][] DeleteRow(int[][] arr, int rowNumber) {
        int rowSize = arr[0].length;
        int columnSize = arr.length ;
        int[][] tempArr = new int[rowSize - 1][columnSize];

        for(int i = 0, count = 0; i < rowSize; i++) {
            // Если текущая строка является той, которую необходимо удалить из исходного массива,
            // то пропускаем итерацию и не копируем её в новый массив
            if(i == rowNumber)
                continue;

            for(int j = 0; j < columnSize; j++) {
                tempArr[count][j] = arr[i][j];
            }
            count++;
        }

        return tempArr;
    }
}
