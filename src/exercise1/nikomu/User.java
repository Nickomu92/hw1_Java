/*******************************************************
 Организовать ввод с клавиатуры даты рождения человека,
 программа должна вывести знак зодиака и название года
 по японскому календарю. Предполагаем, что пользователь
 всегда корректно вводит данные.
********************************************************/

package exercise1.nikomu;

import java.time.LocalDate;

public class User {
    private LocalDate date;     // Поле для хранения даты
    private String strDate;     // Поле для хранения строкового представления даты

    public User(String strDate) {
        this.strDate = strDate;
    }

    // Метод для создания даты из её строкового представления
    private void StringToDate() {
        // Парисм дату рождения на составляющие - день, месяц, год
        String[] dateElements = strDate.split("[\\s .,/\\-_ ]+");

        // Переменная для хранения дня
        int day = Integer.parseInt(dateElements[0]);
        // Переменная для хранения месяца
        int month = 0;
        // Переменная для хранения года
        int year = Integer.parseInt(dateElements[2]);
        // Временная переменная для проверки введенного  названия месяца
        String tempMonth = dateElements[1].toLowerCase();

        if (tempMonth.contains("январ"))
            month = 1;

        else if (tempMonth.contains("феврал"))
            month = 2;

        else if (tempMonth.contains("март"))
            month = 3;

        else if (tempMonth.contains("апрел"))
            month = 4;

        else if (tempMonth.contains("ма"))
            month = 5;

        else if (tempMonth.contains("июн"))
            month = 6;

        else if (tempMonth.contains("июл"))
            month = 7;

        else if (tempMonth.contains("август"))
            month = 8;

        else if (tempMonth.contains("сентябр"))
            month = 9;

        else if (tempMonth.contains("октябр"))
            month = 10;

        else if (tempMonth.contains("ноябр"))
            month = 11;

        else if (tempMonth.contains("декабр"))
            month = 12;

        else if (tempMonth.matches("[-+]?\\d+")) {
            if (Integer.parseInt(tempMonth) >= 1 && Integer.parseInt(tempMonth) <= 12)
                month = Integer.parseInt(tempMonth);
        }

        // Создаем дату рождения на основании полученных от пользователя данных
        date = LocalDate.of(year, month, day);
    }

    // Метод для получения информации
    public void GetInfo() {
        StringToDate();
        System.out.println("Знак: " + GetClassicZodiac() + ";");
        System.out.printf("Год: %s.", GetJapaneseZodiac());
    }

    // Метод для получение информации по классическому календарю
    public String GetClassicZodiac() {

        // Парсим дату рождения пользователя
        int day = this.date.getDayOfMonth();
        int month = this.date.getMonthValue();

        // Переменная для хранения информации по знаку зодиака
        String classicZodiac = null;

        if ((day >= 21 && day <= 31 && month == 3) || (day <= 20 && month == 4))
            classicZodiac = "Овен";

        else if ((day >= 21 && day <= 30 && month == 4) || (day <= 21 && month == 5))
            classicZodiac = "Телец";

        else if ((day >= 22 && day <= 31 && month == 5) || (day <= 21 && month == 6))
            classicZodiac = "Близнецы";

        else if ((day >= 23 && day <= 30 && month == 6) || (day <= 22 && month == 7))
            classicZodiac = "Рак";

        else if ((day >= 23 && day <= 31 && month == 7) || (day <= 21 && month == 8))
            classicZodiac = "Лев";

        else if ((day >= 22 && day <= 31 && month == 8) || (day <= 23 && month == 9))
            classicZodiac = "Дева";

        else if ((day >= 24 && day <= 30 && month == 9) || (day <= 23 && month == 10))
            classicZodiac = "Весы";

        else if ((day >= 24 && day <= 31 && month == 10) || (day <= 22 && month == 11))
            classicZodiac = "Скорпион";

        else if ((day >= 23 && day <= 30 && month == 11) || (day <= 22 && month == 12))
            classicZodiac = "Стрелец";

        else if ((day >= 23 && day <= 31 && month == 12) || (day <= 20 && month == 1))
            classicZodiac = "Козерог";

        else if ((day >= 21 && day <= 31 && month == 1) || (day <= 19 && month == 2))
            classicZodiac = "Водолей";

        else if ((day >= 20 && day <= 29 && month == 2) || (day <= 20 && month == 3))
            classicZodiac = "Рыбы";

        return classicZodiac;
    }

    // Метод для получение информации по японскому календарю
    public String GetJapaneseZodiac() {
        // Парсим дату рождения пользователя
        int year = this.date.getYear();

        // 12 - количество знаков зодиака
        int zodiacNum = year % 12;

        // Переменная для хранения информации по японскому календарю
        String japaneseZodiac = null;

        switch (Math.abs(zodiacNum)) {
            case 0:
                japaneseZodiac = "Обезьяны";
                break;

            case 1:
                japaneseZodiac = "Петуха";
                break;

            case 2:
                japaneseZodiac = "Собаки";
                break;

            case 3:
                japaneseZodiac =  "Свиньи";
                break;

            case 4:
                japaneseZodiac =  "Крысы";
                break;

            case 5:
                japaneseZodiac = "Быка";
                break;

            case 6:
                japaneseZodiac =  "Тигра";
                break;

            case 7:
                japaneseZodiac =  "Кролика";
                break;

            case 8:
                japaneseZodiac =  "Дракона";
                break;

            case 9:
                japaneseZodiac =  "Змеи";
                break;

            case 10:
                japaneseZodiac =  "Лошади";
                break;

            case 11:
                japaneseZodiac =  "Козы";
                break;
        }

        return japaneseZodiac;
    }
}
