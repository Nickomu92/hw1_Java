/*************************************************************************
 Организовать ввод с клавиатуры даты рождения человека, программа должна
 вывести знак зодиака и название года по японскому календарю. Предполагаем,
 что пользователь всегда корректно вводит данные.
 ************************************************************************/

package exercise1.nikomu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] argc) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите дату Вашего рождения в формате [день месяц год]: ");
        String date = input.nextLine();

        // Создаем экземпляр нашего класса User
        User user = new User(date);
        user.GetInfo();
        System.out.println("\n");
    }
}
