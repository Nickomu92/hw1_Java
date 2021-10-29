package exercise4.nikomu;

// Класс который представляет сущность - числа Армстронга в указанном диапазоне
public class ArmstrongNumbers {
    private int start;      // Поле для хранения начала диапазона
    private int end;        // Поле для хранения конца диапазона

    // Конструктор
    public ArmstrongNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Метод для нахождения суммы всех цифр возведенных в степень (количество цифр в числе), составляющих число
    private int Sum(int number) {
        // Переменная для хранения суммы цифр, возведенных в степень
        int sum = 0;
        // Переменная для хранения значения степени
        int power = Integer.toString(number).length();
        // Переменная для хранения значений цифр
        int digit = 0;

        do {
            digit = number % 10;
            number /= 10;
            sum += Math.pow(digit, power);
        } while(number > 0);

        return sum;
    }

    // Метод для отображения чисел Армстронга
    public void ShowNumbers() {
        System.out.println("числа Армстронга");
        for(int i = this.start, count = 0; i <= this.end; i++) {
            if(i == Sum(i))
                System.out.println(++count + "-е число = " + i);
        }
    }
}
