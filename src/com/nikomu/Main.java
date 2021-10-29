/*****************************************************
    Общее "меню" для всех заданий для удобной работы.
 ****************************************************/

package com.nikomu;

// Импортируем пакеты, содержащие программы которые решают наши задачи
import exercise1.nikomu.Main1;
import exercise2.nikomu.Main2;
import exercise3.nikomu.Main3;
import exercise4.nikomu.Main4;
import exercise5.nikomu.Main5;
import exercise6.nikomu.Main6;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Переменная для хранения значения выбора пункта меню
        String symb = null;
        do {
            System.out.println("\n\t\t\tMenu");
            String menu = """
                                [1] - Задание № 1;
                                [2] - Задание № 2;
                                [3] - Задание № 3;
                                [4] - Задание № 4;
                                [5] - Задание № 5;
                                [6] - Задание № 6;
                                
                                [0] - Выход.
                            """;

            System.out.println(menu);
            System.out.print("Ваш выбор: ");
            symb = input.nextLine();
            System.out.println();

            switch (symb) {
                case "1":
                    Main1.main(null);
                    break;

                case "2":
                    Main2.main(null);
                    break;

                case "3":
                    Main3.main(null);
                    break;

                case "4":
                    Main4.main(null);
                    break;

                case "5":
                    Main5.main(null);
                    break;

                case "6":
                    Main6.main(null);
                    break;
            }

        } while(symb != "0");
    }
}
