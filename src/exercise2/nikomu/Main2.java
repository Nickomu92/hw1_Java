/********************************************************************
 2. Программа запрашивает шестизначное число, послеввода определяет
 будет ли являтся счастливым билетс таким номером (сумма первых трех
 цифр совпадает с сумой трех последних).
*********************************************************************/

package exercise2.nikomu;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {

    // Функция для проверки является ли номер билета счастливым
    public static String CheckTicketNumber(int number) {
        // Переменные для хранения левой и правой частей номера билета
        int left = 0, right = 0;

        // Делим номер билета на две части - правую и левую (по 3 цифры в каждой)
        for(int i = 0; i < 6; i++) {

            // Создаем правую часть номера билета
            if(i < 3)
                right += number % 10;

            // Создаем левую часть номера билета
            else
                left += number % 10;

            number /= 10;
        }

        // Если полученная левая и правая части билета равны, то билет счастливый
        if(left == right)
            return "счасливый";

        // Иначе - несчастливый
        else
            return "обычный";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите шестизначное число номера билета для проверки: ");
        String stringTicketNumber = input.nextLine();

        // В цикле проверяем введеные пользователем даные и если пользователь ввел не
        // шестизначное число, то:
        while (!Pattern.compile("\\d{6}").matcher(stringTicketNumber).matches()) {
            // Выводим сообщение об ошибке
            System.out.println("Ошибка ввода!!! Укажите шестизначное число.\n");
            // Запрашиваем повторный ввод
            System.out.print("Введите шестизначное число номера билета для проверки: ");
            stringTicketNumber = input.nextLine();
        }

        // Переменная для хранения шестизначного номера билета
        int number = Integer.parseInt(stringTicketNumber);

        System.out.printf("Ваш билет - %s.\n", CheckTicketNumber(number));
    }
}
